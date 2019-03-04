GIT_SHORT_TAG := $(shell git rev-parse --short HEAD)
#APP_NAME=nginx-test
SHELL:=/bin/bash
hello:
	@echo hello from $(GIT_SHORT_TAG)
build:
	docker build -t $(APP_NAME)-$(GIT_SHORT_TAG) .
