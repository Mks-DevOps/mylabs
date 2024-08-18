```hcl
terraform {
  required_providers {
    aws = {
      source = "hashicorp/aws"
      version = "5.11.0"
    }
  }
}

#provider with AZ
provider "aws" {
region = "us-east-1"
}
```
