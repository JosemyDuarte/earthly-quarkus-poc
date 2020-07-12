## Earthly with Github Actions POC 
![CI](https://github.com/JosemyDuarte/eartly-quarkus-poc/workflows/CI/badge.svg)

Small Proof of Concept mixing [Funqy](https://quarkus.io/guides/amazon-lambda-http) a tool that allows you to build serverless app agnostic of the cloud provider, and [Earthly](https://www.earthly.dev/) a new build automation system based on containers. Interesting to note that this is being built by Github Actions also using Earthly.

### Requirements

* Git
* Docker
* [Earthly](https://www.earthly.dev/)
* [AWS CLI](https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-install.html)
* [AWS SAM CLI](https://docs.aws.amazon.com/serverless-application-model/latest/developerguide/serverless-sam-cli-install.html)

### How to make it work?

To build the project just run

```shell script
earth +build
````

And to have it running in your machine run

```shell script
sam local start-api --template target/sam.native.yaml
```

It will be listening on [http://localhost:3000](). Now you can go to [http://localhost:3000/greet/hi]() and a serverless function will give say "hello".

For more details about Quarkus, Funqy or how to deploy this to AWS take a look at https://quarkus.io/guides/amazon-lambda-http.