SHELL:=/bin/bash
hello:
	@echo hello from $(GO_TO_REVISION_MYGIT)
build:
	docker build -t $(APP_NAME):v$(GO_TO_REVISION_MYGIT) .
	docker tag $(APP_NAME):v$(GO_TO_REVISION_MYGIT)  mijack/$(APP_NAME):v$(GO_TO_REVISION_MYGIT) 
	docker tag $(APP_NAME):v$(GO_TO_REVISION_MYGIT)  mijack/$(APP_NAME):latest
