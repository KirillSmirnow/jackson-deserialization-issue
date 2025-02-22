# Error

## When we send a request to /abc, we get the following error:

```
com.fasterxml.jackson.databind.exc.InvalidDefinitionException: Cannot construct instance of `org.example.Dto` (no Creators, like default constructor, exist): cannot deserialize from Object value (no delegate- or property-based Creator)
```

## To fix this error, add `lombok.config` with the following content to the root folder (also, rebuild the project):

```
lombok.anyConstructor.addConstructorProperties = true
```
