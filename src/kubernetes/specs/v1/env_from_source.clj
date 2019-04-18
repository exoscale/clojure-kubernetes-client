(ns kubernetes.specs.v1/env-from-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/config-map-env-source :refer :all]
            [kubernetes.specs.v1/secret-env-source :refer :all]
            )
  (:import (java.io File)))


(def v1/env-from-source-data
  {
   (ds/opt :configMapRef) v1/config-map-env-source-spec
   (ds/opt :prefix) string?
   (ds/opt :secretRef) v1/secret-env-source-spec
   })

(def v1/env-from-source-spec
  (ds/spec
    {:name ::v1/env-from-source
     :spec v1/env-from-source-data}))
