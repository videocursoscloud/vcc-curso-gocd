SHELL:=/bin/bash
hello:
	@echo hello from $(GO_TO_REVISION_MYGIT)
build:
	docker build -t $(APP_NAME):v$(GO_TO_REVISION_MYGIT) .
	docker tag $(APP_NAME):v$(GO_TO_REVISION_MYGIT)  mijack/$(APP_NAME):v$(GO_TO_REVISION_MYGIT) 
	docker tag $(APP_NAME):v$(GO_TO_REVISION_MYGIT)  mijack/$(APP_NAME):latest
test:
	HTTP_LOCAL_PORT=${HTTP_LOCAL_PORT} docker-compose up -d
	curl localhost:${HTTP_LOCAL_PORT} -s  -v > /dev/null || echo "Failed"
	HTTP_LOCAL_PORT=${HTTP_LOCAL_PORT} docker-compose down 
