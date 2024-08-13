# multiple providers

You can use multiple providers in a single terraform project. for example,

1. Create a provider.tf file on your root directory of terraform project
2. In provider.tf file, define AWS and Azure providers. For example


```
provider "aws"{
  region = "us-east-1"
}

provider "azurerm"{
  subscription_id = "your_azure_subscription_id"
  client_id = "your-azure-client-id"
  client_secret = "your-azure-client-secret"
  tenant_id = "your-azure-tenant-id"
}
```


3. In your other Terraform configuration files, you can then use the aws and azurerm providers to create resources in AWS and Azure, respectively,

```
resource "aws_instance" "example" {
  ami = "ami-0123456789abcdef0"
  instance_type = "t2.micro"
}

resource "azurerm_virtual_machine" "example" {
  name = "example-vm"
  location = "eastus"
  size = "Standard_A1"
}
```
