provider "aws" {
  region = "us-east-1"
}
module "ec2-Instance" {
  source = "./module"
  ami_value = "ami-04a81a99f5ec58529"
  instance_type_value = "t2.micro"

}
