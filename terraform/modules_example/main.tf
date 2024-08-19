#defining_aws_provider with region
provider "aws" {
    region = "us-east-1"  # Set your desired AWS region
}
#resource name defined
resource "aws_instance" "example" {
#ami id defined as variable
  ami = var.ami_value
#instance type defined as variable
  instance_type = var.instance_type_value
}
