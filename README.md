# Sample Android Project Configuration
This project is basic application with default configuration for Android application. It contains necessary dependencies, gradle modifications and base project structure.

# Architecture
This sample uses:
* MVVM - as communcation model
* Clean Architecture - as package model
* Single Activity Application - as ui model

# Dependencies
Below are listed dependencies that are implemented to this android application

## ViewModel
> [version : `2.2.0`](https://developer.android.com/topic/libraries/architecture/viewmodel)
>
Application has one fragment and aligned `androiX ViewModel`. Both named with prefix `Master`.
Configured to maintain communication between Fragment and ViewModel
## Navigation
> [version : `2.3.0-alpha04`](https://developer.android.com/guide/navigation)

Application has one fragment so there is one node in navigation graph for `MasterFragment` but
it is prepared to contain more.

## Rx Android
> [RxAndroid gitpage ](https://github.com/ReactiveX/RxAndroid)
>
> [rxJava : 2.2.19](https://mvnrepository.com/artifact/io.reactivex.rxjava2/rxjava)
>
> [rxKotlin : 2.4.0](https://mvnrepository.com/artifact/io.reactivex.rxjava2/rxkotlin)
>
> [rxAndroid : 2.1.1](https://mvnrepository.com/artifact/io.reactivex.rxjava2/rxandroid)

Application is prepared to use all utils from Rx for Android with RxJava2, RxAndroid and RxKotlin.
There are also prepared some extensions and sample usage of stream and subjects to provide communication
between Fragment and ViewModel using ReactiveX. [Learn more...](https://github.com/ReactiveX/RxAndroid)
## Dagger
> [version: 2.26](https://github.com/google/dagger)

Application provides base setup for Dagger2.  
Configured:
* App factory, added to manifest
* AppComponent - base component of Application
* ActivityBuilder - module to provide Activity Scope elements
* FragmentBuilder - module to provide Fragment Scope elements
* CustomScopes - defined to scope elements by Android Components

This configuration allows to use Dagger ready to go in application
> Note that there is missing of some non-standard `modules`, just add them to `AppComponent`
> or to modules for specific builders if needed. Just like in `ActivityBuilder`

e.g:
```kotlin
@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AndroidSupportInjectionModule::class,
        ApiModule::class, // <- ADD THIS HERE 
        ...
    ]
)
interface AppComponent : AndroidInjector<App> {
    @Component.Factory
    interface Factory : AndroidInjector.Factory<App>
}

@Module  // <- HERE IS YOUR MODULE
class ApiModule {
    ...
}

```
## Timber
> [version: 4.7.1](https://github.com/JakeWharton/timber)

Application has planted one debugTree in `MainActivity` to simplify logging in application
>Note that you should consider using specific other tree to other build types like debug and prod. [Learn more ...](https://github.com/JakeWharton/timber)

## Others
* Kotlin kapt enabled
* Java vesrsion set as target
* DataBinding enabled
* Layout stays as default with ConstraintLayouts
* Min Android SDK set : 23, Marshmellow (6.0)

# Conclusion
Copying this project should allow developer to run working sample of application with included all necessary dependencies for modern applications.
