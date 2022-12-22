Ruby DSL
==========

there are already ruby DSL which cover some functionality maven offers. like a [RubyGems](http://rubygems.org) is a package format which embeds meta data and dependencies about the ruby code. it is like a jar file packed with a pom. or [bundler](http://gembundler.com) deals with dependencies and how to manage them. instead of creating something new for maven the idea is to just take these existing ones use them with polyglot-maven.

# Gemspec DSL #

with having a gemspec as pom and you can use polyglot maven (pmaven) to run the test (spec or cucumber features), pack it and install as gem artifact. the description of that [RubyGem::Specification](http://docs.rubygems.org/read/chapter/20). a simple example looks like this:

    Gem::Specification.new do |s|
      s.name = 'example'
      s.version = '1.0'
      s.summary = 'Example gem specification'
    end

with such gemspec in place you can setup the a local gem repository in target/rubygems

    $ pmvn initialize

to run all test, i.e. rspec and cucumber - regular runit test is not yet supported. specs are run if there is a **rspec** dependency and features are run if there is a **cucumber** depdencency in the gemspec file.

    $ pmvn test

or

    $ pmvn rspec:test
    $ pmvn cucumber:test
    
package the gem in target

    $ pmvn package
 
or install into the local maven repository
 
    $ pmvn install

and finally deploy it or push it to rubygems.org

    $ pmvn deploy
    
you can also execute a ruby script in context of the gemspec file, i.e. you can use declared gem dependencies.

    $ pmvn gem:exec -Dexec.script="require 'fileutils'; FileUtils.ln_s('my.gemspec.pom', 'pom.xml')"

similar you can start an irb session (i.e. a console) in the gemspec context

    $ pmvn gem:irb
    
or as swing application

    $ pmvn gem:irb -Dirb.swing
  
## dependencies in the ruby world ##

the common way of declaring dependencies in ruby is something like: __rspec ~>2.4.1__ which means all version bigger or equals then 2.4.1 and smaller then 2.5.0. so it is a version range and the dependency resolution varies over time depending on the availability of version for a given gem. and this can break your coed !!! bundler does have a possible solution for it - see below.

## getting more Maven along side the gemspec ##

if you need more control over what pmaven does you can use the file **Mavenfile** to add more maven specific declarations. for more details see below.

# Gemfile from Bundler as Maven Ruby DSL #

Gemfile can declare dependencies and can group them into profiles (groups in bundler speak and profile in maven speak but with further small differences too). further it can include the dependencies of one or more gemspec files.

one big thing about bundler is that it solves the uncertainty of version ranges. before you can "use" bunlder you need to run `bundle install` to set up the dependencies. this will write out a file _Gemfile.lock_ which contains the version resolution of the _Gemfile_. any successive run will use the versions of that _Gemfile.lock_ instead of resolve them with the latest gems in the repositories. bundler has some more commands to update and check _Gemfile_ and _Gemfile.lock_.

pmaven just follows what bundler does in a maven way. the main difference is that with pmaven in general you do not need to run `bundle install` (only if you use gems from a git repository or from the local filesystem directly). when pmaven sees a Gemfile.lock it will obey these versions otherwise pmaven will resolve them with the version ranges from the _Gemfile_. so with pmaven to perform an **update** is to delete _Gemfile.lock_.

in this sense _Gemfile.lock_ is part of the DSL and helps to keeps things stable and reproducable. 

the same goals work with _Gemfile_ in the same manner as with the _gemspec_ from above.

## Gemfile and Rails3 application ##

the _Gemfile_ of Rails3 application will be translated to a more suitable pom as in a normal _Gemfile_ project. first the rails3-maven-plugin will be included, the packaging is war not gem as before and it allows to use jetty as development server.

# Mavenfile #

the name follows the *Gemfile* and you can use the same DSL as you use for Gemfile in Mavenfile.

**NOTE:** bundler does use **ONLY** _Gemfile_ and _Gemfile.lock_ and will ignore _Mavenfile_. that _Mavenfile_ is meant for maven stuff !

## gem dependencies ##

### NAME (required)

For each gem requirement, list a single _gem_ line.

    gem "nokogiri"

### VERSION

Each _gem_ *MAY* have one or more version specifiers.

    gem "nokogiri", ">= 1.4.2"
    gem "RedCloth", ">= 4.1.0", "< 4.2.0"

## jar or test_jar dependencies ##

### NAME and VERSION (required)

For each jar artifact, list a single _jar_  or _test\_jar_ line with version (range). the name is the _groupId:artifactId_

    jar "org.slf4r:slf4r-simple", '1.6.2'
    
### SCOPE or CLASSIFIER

    jar("org.slf4r:slf4r-simple", '1.6.2').scope = :test

    jar("org.slf4r:slf4r-simple", '1.6.2').classifier = :source

or use the nested block (this time as test_jar)

    test_jar("org.slf4r:slf4r-simple", '1.6.2') do |simple|
      simple.scope :test
      simple.classifier :source
    end

## meta data ##

### GROUP\_ID, ARTIFACT\_ID, VERSION, PACKAGING

    group_id "rubygems"
    artifact_id "one"
    version "0.1.0"
    packaging "gem"

### NAME, DESCRIPTION, URL ###

    name "some name"
    description "longer description"
    url "http://github.com"

### DEVELOPERS ###

    developers.new("my name", "my_email@example.com")
    
or

    developers.new("my name <my_email@example.com>")
    
### LICENSES ###

add the license file like

    licenses.new("MIT-LICENSE.txt")

or the url

    licenses.new("http://www.gnu.org/licenses/gpl.html")
    
### REPOSITORIES and PLUGIN_REPOSITORIES ##

add a repository with defaults

    repository("rubygems-releases", "http://gems.saumya.de/releases")

or a snapshot repository for plugins

    plugin_repository("sonatype-snapshots") do |sonatype|
      sonatype.url "http://oss.sonatype.org/content/repositories/snapshots"
      sonatype.releases(:enabled => false)
      sonatype.snapshots(:enabled => true)
    end
    
or a full fledge one

    repository("jboss-public-repository-group") do |jboss|
      jboss.name "JBoss Public Maven Repository Group"
      jboss.url "https://repository.jboss.org/nexus/content/groups/public-jboss/"
      jboss.releases(:enabled => false, :updatePolicy => :never, :checksumPloicy => :strict)
      jboss.snapshots(:enabled => true, :updatePolicy => :daily, :checksumPloicy => :ignore)
    end
    
you can retrieve a hashmap with repositories or plugin repositories with
    
    repositories
    
respectively
   
    plugin_repositories
    

### PROPERTIES ###

it comes with a few default properties which can be overwritten

    properties["gem.home"] = "${project.build.directory}/rubygems"
    properties["gem.path"] = "${project.build.directory}/rubygems"
    properties["jruby.plugins.version"] = "0.27.0-SNAPSHOT"
    properties["project.build.sourceEncoding"] = "UTF-8"

to deal with ruby and rubygems specific stuff there are several maven plugins which are used: gem-maven-plugin, rspec-maven-plugin, cucumber-maven-plugin, etc. they are carry the version **${jruby.plugins.version}**. you an overwrite this property inside the **Mavenfile**.

in general you can set properties like above or 

    properties.merge!({
      "gem.home" => "~/gem"
    })

or replace the existing through new ones

    properties = { "gem.home" => "~/gem" }

## build process ##

in general the _build_ tag of a maven pom gets omited but is actually there. for example `plugin(name)` just delegates to `build.plugin(name)`.

### DEPENDENCIES, DEPENDENCY_MANAGEMENT ###

all example are in context of the project or a profile or a plugin
 
     dependency_management do |deps|
       deps.gem "slf4r", "0.4.2"
       deps.jar "org.slf4j:slf4j-simple", "1.6.2"
     end

and dependencies via the collection

     dependencies do |d| 
       d.gem "rspec"
       d.test_jar "org.slf4j:slf4j-noop", "1.6.2"
     end

or the same in direct way
  
     gem "rspec"
     test_jar "org.slf4j:slf4j-noop", "1.6.2"

and with exclusions

     jar 'org.xerial:sqlite-jdbc', '3.6.10' do |j|
       j.exclude 'org.xerial.thirdparty:nestedvm'
     end
     
or the same via the exclusions collection

     jar 'org.xerial:sqlite-jdbc', '3.6.10' do |j|
       j.exclusions << 'org.xerial.thirdparty:nestedvm'
     end
     
the latter can also be written differently. the object created can be used to call methods on it.

     sqlite = gem 'sqlite-jdbc', '3.6.10'
     sqlite.exclusions << 'nestedvm'

a dependency can be retrieved and call further methods on it.

     gem 'sqlite-jdbc', '3.6.10'
     gem('sqlite-jdbc').exclusions << 'nestedvm'

### PLUGINS ###

add a maven default plugin

    plugin 'release'
    
or a maven default plugin with version

    plugin("clean", "2.4.1")

or a maven default plugin with configuration

    plugin(:compile, "2.3.2").with :source => "1.5", :target => "1.5"
    
also the jruby-maven-plugins can have a short name:

* `:jruby` or `"jruby"` for jruby-maven-plugin
* `:gem` or `"gem"` for gem-maven-plugin
* `:cucumber` or `"cucumber"` for cucumber-maven-plugin
* `:rspec` or `"rspec"` for rspec-maven-plugin
* `:runit` or `"runit"` for runit-maven-plugin
* `:rake` or `"rake"` for rake-maven-plugin
* `:rails3` or `"rails3"` for rails3-maven-plugin
* `:rails2` or `"rails2"` for rails2-maven-plugin
* `:bundler` or `"bundler"` for bundler-maven-plugin
* `:gemify` or `"gemify"` for gemify-maven-plugin

plugin with extentions

    plugin(:gem).extensions true
    
or any other plugin with execution goals (default execution without id)

    plugin('org.codehaus.mojo:gwt-maven-plugin', '2.1.0').execution.goals = ["clean", "compile", "test"]

or you want to execute a goal in a phase

    plugin(:gem).in_phase("pre-integration-test").execute_goal(:install)
    
or a goal in a phase with configuration

    plugin(:cucumber).in_phase("integration-test").execute_goal(:test).with(:cucumberArgs => "--no-colors")

if you can not use the short name then the plugin name is the combination of
_<groupId>:<artifactId>_ as with the jar dependencies. use the block notation when you need to do more with the plugin

    plugin('org.codehaus.mojo:gwt-maven-plugin', '2.1.0') do |gwt|
      gwt.with({ :extraJvmArgs => "-Xmx512m",
                 :runTarget => "example.html"
               })
      gwt.execution.goals << ["clean", "compile", "test"]
    end

in case the hashmap notation for the configuration part is not sufficient you can pass in XML directly (the hashmap notation does not attributes like _implementation_ in the _connector_ tag)

    plugin("org.mortbay.jetty:jetty-maven-plugin", "7.2.2.v20101205").with({
                :connectors => <<-XML

		<connector implementation="org.eclipse.jetty.server.nio.SelectChannelConnector">
		  <port>8080</port>
		</connector>
		<connector implementation="org.eclipse.jetty.server.ssl.SslSelectChannelConnector">
		  <port>8443</port>
		  <keystore>${project.basedir}/src/test/resources/server.keystore</keystore>
		  <keyPassword>123456</keyPassword>
		  <password>123456</password>
		</connector>
    XML
              })
	  
sometimes you a nested array (here _webResources_ has a list of _resource_)

    plugin(:war).with({
      :webResources => Maven::Model::NamedArray.new(:resource) do |l|
         l << { :directory => "public" }
         l << { 
                :directory => ".",
                :targetPath => "WEB-INF",
                :includes => ['app/**', 'config/**', 'lib/**', 'vendor/**', 'Gemfile']
              }
         l << {
                :directory => '${gem.path}',
                :targetPath => 'WEB-INF/gems'
              }
        end
      })
      
### EXECUTE\_IN\_PHASE ###

you can write ruby code directly inside the _Mavenfile_ which will be executed in the specified phase

    execute_in_phase(:verify) do
      puts "all OK"
    end

## profiles ##

profiles and groups from Gemfile are similiar but not the same. in maven you choose one or more profiles to be active and they participate with action you want to perform. the groups with bundler do all participate with dependency resolution so the resovled version are consistent over *all* groups.

### ACTIVATION ###

activation of a profile by default

    profile(:development).activation.by_default

or by property

    profile(:test).activation.property("rails.env", "test")

or via OS (triggered by `family` or `arch` or `name` or `version`)

    profile("mac").activation.os.family = "mac"

### PLUGIN, PROPERTIES, DEPENDENCY, DEPENDENCY_MANAGEMENT ###

any of these nested attributes can set with the help of the block notation

    profile(:production) do |prod|   
      prod.activation.property("rails.env", "production")
      prod.properties.merge!({ 
         "gem.home" => "${project.build.directory}/rubygems-production", 
         "gem.path" => "${project.build.directory}/rubygems-production" 
      })
      prod.plugin("org.mortbay.jetty:jetty-maven-plugin", "${jetty.version}")
      prod.gem "cucumber", nil
      prod.dependency_management.gem "cucumber", '0.9.4'
    end
    
### GEM, JAR ###

the following group notation will add the gem and the jar to the "test" profile:

    profile :test do
      gem "enforce-ssl"
      jar "org.slf4j:slf4j-noop", "1.6.2"
    end

# missing parts from maven #

there are still missing parts, like the *parent* tag or the *modules* or all this report related tags.
