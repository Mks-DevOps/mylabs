provider "aws" {
  region = "us-east-1"
}
#calling module_example dir, here we do not have to define variable
module "ec2-Instance" {
  source = "./module"
  ami_value = "ami-04a81a99f5ec58529"
  instance_type_value = "t2.micro"

}
