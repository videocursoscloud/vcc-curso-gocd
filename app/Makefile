GIT_SHORT_TAG := $(shell git rev-parse --short HEAD)
SHELL:=/bin/bash
hello:
	@echo hello from $(GIT_SHORT_TAG)
build:
	docker build -t nginx-test-$(GIT_SORT_TAG) .
