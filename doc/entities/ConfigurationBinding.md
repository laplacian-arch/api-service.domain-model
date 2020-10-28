# **ConfigurationBinding**
**namespace:** laplacian.arch.api.service

configuration_binding



---

## Properties

### name: `String`
The name of this configuration_binding.
- **Attributes:** *PK*

### category: `String`
The category of this configuration_binding.
- **Attributes:** *PK*

### variable_name: `String`
The variable_name of this configuration_binding.
- **Default Value:**
  ```kotlin
  "${name.lowerCamelize()}"
  ```

## Relationships

### definition: `ServiceConfiguration`
definition
- **Cardinality:** `1`