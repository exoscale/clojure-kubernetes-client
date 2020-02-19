#!/usr/bin/env bash

# Copyright 2017 The Kubernetes Authors.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

set -o errexit
set -o nounset
set -o pipefail

SCRIPT_ROOT=$(dirname "${BASH_SOURCE}")
pushd "${SCRIPT_ROOT}" > /dev/null
SCRIPT_ROOT=`pwd`
popd > /dev/null

CLIENT_ROOT="${SCRIPT_ROOT}/.."
pushd "${CLIENT_ROOT}" > /dev/null
CLIENT_ROOT=`pwd`
popd > /dev/null

SETTING_FILE="${SCRIPT_ROOT}/../settings"

source "${SCRIPT_ROOT}/openapi-generator/client-generator.sh"
source "${SETTING_FILE}"

# Latest version as of Mar 15, 2019
#OPENAPI_GENERATOR_COMMIT="${OPENAPI_GENERATOR_COMMIT:-c9737cf97d5e31936639842d389118e980ee85a9}"; \
# Dajac's version
OPENAPI_GENERATOR_USER_ORG=exoscale; \
OPENAPI_GENERATOR_COMMIT="${OPENAPI_GENERATOR_COMMIT:-3faf1465cd9efca7507793dd5db4349567c446ee}"; \
CLIENT_LANGUAGE=clojure; \
CLEANUP_DIRS=(src/clojure_kubernetes_client project.clj git_push.sh .gitignore); \

kubeclient::generator::generate_client "${CLIENT_ROOT}"

echo "---Done."
