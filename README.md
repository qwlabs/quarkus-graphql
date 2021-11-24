1、run command
```shell
./gradlew services:api-service:quarkusDev
```

2、will got exception in bootstrap stage
```log
$ ./gradlew services:api-service:quarkusDev

> Task :services:api-service:quarkusDev
Listening for transport dt_socket at address: 5005
Press [h] for more options>
Tests paused
Press [r] to resume testing, [h] for more options>
Press [r] to resume testing, [o] Toggle test output, [h] for more options>
2021-11-24 21:32:13,150 WARN  [io.qua.arc.dep.SplitPackageProcessor] (build-19) Detected a split package usage which is considered a bad practice and should be avoided. Following packages were detected in multiple archives:
- "com.qwlabs.quarkus" found in [qwlabs.crp:security::jar, qwlabs.crp:shared::jar]
     2021-11-24 21:32:13,304 INFO  [io.qua.dep.dev.IsolatedDevModeMain] (main) Attempting to start live reload endpoint to recover from previous Quarkus startup failure2s]
> :se2021-11-24 21:32:13,395 INFO  [org.jbo.threads] (main) JBoss Threads version 3.4.2.Final
<====2021-11-24 21:32:13,574 ERROR [io.qua.dep.dev.IsolatedDevModeMain] (main) Failed to start quarkus: java.lang.RuntimeException: io.quarkus.builder.BuildException: Build failure: Build failed due to errors
        [error]: Build step io.quarkus.arc.deployment.ArcProcessor#validate threw an exception: javax.enterprise.inject.spi.DeploymentException: javax.enterprise.inject.UnsatisfiedResolutionException: Unsatisfied dependency for type com.qwlabs.quarkus.SecurityMessages and qualifiers [@Default]
        - java member: com.qwlabs.quarkus.IdentityService#<init>()
        - declared on CLASS bean [types=[com.qwlabs.quarkus.IdentityService, java.lang.Object], qualifiers=[@Default, @Any], target=com.qwlabs.quarkus.IdentityService]
        at io.quarkus.arc.processor.BeanDeployment.processErrors(BeanDeployment.java:1190)
        at io.quarkus.arc.processor.BeanDeployment.init(BeanDeployment.java:268)
        at io.quarkus.arc.processor.BeanProcessor.initialize(BeanProcessor.java:129)
        at io.quarkus.arc.deployment.ArcProcessor.validate(ArcProcessor.java:418)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.base/java.lang.reflect.Method.invoke(Method.java:566)
        at io.quarkus.deployment.ExtensionLoader$2.execute(ExtensionLoader.java:821)
        at io.quarkus.builder.BuildContext.run(BuildContext.java:277)
        at org.jboss.threads.ContextHandler$1.runWith(ContextHandler.java:18)
        at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
        at java.base/java.lang.Thread.run(Thread.java:834)
        at org.jboss.threads.JBossThread.run(JBossThread.java:501)
Caused by: javax.enterprise.inject.UnsatisfiedResolutionException: Unsatisfied dependency for type com.qwlabs.quarkus.SecurityMessages and qualifiers [@Default]
        - java member: com.qwlabs.quarkus.IdentityService#<init>()
        - declared on CLASS bean [types=[com.qwlabs.quarkus.IdentityService, java.lang.Object], qualifiers=[@Default, @Any], target=com.qwlabs.quarkus.IdentityService]
        at io.quarkus.arc.processor.Beans.resolveInjectionPoint(Beans.java:567)
        at io.quarkus.arc.processor.BeanInfo.init(BeanInfo.java:470)
        at io.quarkus.arc.processor.BeanDeployment.init(BeanDeployment.java:256)
        ... 13 more

        at io.quarkus.runner.bootstrap.AugmentActionImpl.runAugment(AugmentActionImpl.java:418)
        at io.quarkus.runner.bootstrap.AugmentActionImpl.createInitialRuntimeApplication(AugmentActionImpl.java:276)
        at io.quarkus.runner.bootstrap.AugmentActionImpl.createInitialRuntimeApplication(AugmentActionImpl.java:67)
        at io.quarkus.deployment.dev.IsolatedDevModeMain.firstStart(IsolatedDevModeMain.java:91)
        at io.quarkus.deployment.dev.IsolatedDevModeMain.accept(IsolatedDevModeMain.java:446)
        at io.quarkus.deployment.dev.IsolatedDevModeMain.accept(IsolatedDevModeMain.java:65)
        at io.quarkus.bootstrap.app.CuratedApplication.runInCl(CuratedApplication.java:149)
        at io.quarkus.bootstrap.app.CuratedApplication.runInAugmentClassLoader(CuratedApplication.java:105)
        at io.quarkus.deployment.dev.DevModeMain.start(DevModeMain.java:145)
        at io.quarkus.deployment.dev.DevModeMain.main(DevModeMain.java:63)
Caused by: io.quarkus.builder.BuildException: Build failure: Build failed due to errors
        [error]: Build step io.quarkus.arc.deployment.ArcProcessor#validate threw an exception: javax.enterprise.inject.spi.DeploymentException: javax.enterprise.inject.UnsatisfiedResolutionException: Unsatisfied dependency for type com.qwlabs.quarkus.SecurityMessages and qualifiers [@Default]
        - java member: com.qwlabs.quarkus.IdentityService#<init>()
        - declared on CLASS bean [types=[com.qwlabs.quarkus.IdentityService, java.lang.Object], qualifiers=[@Default, @Any], target=com.qwlabs.quarkus.IdentityService]
        at io.quarkus.arc.processor.BeanDeployment.processErrors(BeanDeployment.java:1190)
        at io.quarkus.arc.processor.BeanDeployment.init(BeanDeployment.java:268)
        at io.quarkus.arc.processor.BeanProcessor.initialize(BeanProcessor.java:129)
        at io.quarkus.arc.deployment.ArcProcessor.validate(ArcProcessor.java:418)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.base/java.lang.reflect.Method.invoke(Method.java:566)
        at io.quarkus.deployment.ExtensionLoader$2.execute(ExtensionLoader.java:821)
        at io.quarkus.builder.BuildContext.run(BuildContext.java:277)
        at org.jboss.threads.ContextHandler$1.runWith(ContextHandler.java:18)
        at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
        at java.base/java.lang.Thread.run(Thread.java:834)
        at org.jboss.threads.JBossThread.run(JBossThread.java:501)
Caused by: javax.enterprise.inject.UnsatisfiedResolutionException: Unsatisfied dependency for type com.qwlabs.quarkus.SecurityMessages and qualifiers [@Default]
        - java member: com.qwlabs.quarkus.IdentityService#<init>()
        - declared on CLASS bean [types=[com.qwlabs.quarkus.IdentityService, java.lang.Object], qualifiers=[@Default, @Any], target=com.qwlabs.quarkus.IdentityService]
        at io.quarkus.arc.processor.Beans.resolveInjectionPoint(Beans.java:567)
        at io.quarkus.arc.processor.BeanInfo.init(BeanInfo.java:470)
        at io.quarkus.arc.processor.BeanDeployment.init(BeanDeployment.java:256)
        ... 13 more

        at io.quarkus.builder.Execution.run(Execution.java:116)
        at io.quarkus.builder.BuildExecutionBuilder.execute(BuildExecutionBuilder.java:79)
        at io.quarkus.deployment.QuarkusAugmentor.run(QuarkusAugmentor.java:161)
        at io.quarkus.runner.bootstrap.AugmentActionImpl.runAugment(AugmentActionImpl.java:416)
        ... 9 more
Caused by: javax.enterprise.inject.spi.DeploymentException: javax.enterprise.inject.UnsatisfiedResolutionException: Unsatisfied dependency for type com.qwlabs.quarkus.SecurityMessages and qualifiers [@Default]
        - java member: com.qwlabs.quarkus.IdentityService#<init>()
        - declared on CLASS bean [types=[com.qwlabs.quarkus.IdentityService, java.lang.Object], qualifiers=[@Default, @Any], target=com.qwlabs.quarkus.IdentityService]
        at io.quarkus.arc.processor.BeanDeployment.processErrors(BeanDeployment.java:1190)
        at io.quarkus.arc.processor.BeanDeployment.init(BeanDeployment.java:268)
        at io.quarkus.arc.processor.BeanProcessor.initialize(BeanProcessor.java:129)
        at io.quarkus.arc.deployment.ArcProcessor.validate(ArcProcessor.java:418)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.base/java.lang.reflect.Method.invoke(Method.java:566)
        at io.quarkus.deployment.ExtensionLoader$2.execute(ExtensionLoader.java:821)
        at io.quarkus.builder.BuildContext.run(BuildContext.java:277)
        at org.jboss.threads.ContextHandler$1.runWith(ContextHandler.java:18)
        at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
        at java.base/java.lang.Thread.run(Thread.java:834)
        at org.jboss.threads.JBossThread.run(JBossThread.java:501)
Caused by: javax.enterprise.inject.UnsatisfiedResolutionException: Unsatisfied dependency for type com.qwlabs.quarkus.SecurityMessages and qualifiers [@Default]
        - java member: com.qwlabs.quarkus.IdentityService#<init>()
        - declared on CLASS bean [types=[com.qwlabs.quarkus.IdentityService, java.lang.Object], qualifiers=[@Default, @Any], target=com.qwlabs.quarkus.IdentityService]
        at io.quarkus.arc.processor.Beans.resolveInjectionPoint(Beans.java:567)
        at io.quarkus.arc.processor.BeanInfo.init(BeanInfo.java:470)
        at io.quarkus.arc.processor.BeanDeployment.init(BeanDeployment.java:256)
        ... 13 more


<============-> 94% EXECUTING [57s]
> :services:api-service:quarkusDev
```