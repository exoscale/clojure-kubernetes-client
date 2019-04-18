(ns kubernetes.specs.v1/env-var
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/env-var-source :refer :all]
            )
  (:import (java.io File)))


(def v1/env-var-data
  {
   (ds/req :name) string?
   (ds/opt :value) string?
   (ds/opt :valueFrom) v1/env-var-source-spec
   })

(def v1/env-var-spec
  (ds/spec
    {:name ::v1/env-var
     :spec v1/env-var-data}))
