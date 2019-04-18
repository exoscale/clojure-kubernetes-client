(ns kubernetes.specs.v1/env-var-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/config-map-key-selector :refer :all]
            [kubernetes.specs.v1/object-field-selector :refer :all]
            [kubernetes.specs.v1/resource-field-selector :refer :all]
            [kubernetes.specs.v1/secret-key-selector :refer :all]
            )
  (:import (java.io File)))


(def v1/env-var-source-data
  {
   (ds/opt :configMapKeyRef) v1/config-map-key-selector-spec
   (ds/opt :fieldRef) v1/object-field-selector-spec
   (ds/opt :resourceFieldRef) v1/resource-field-selector-spec
   (ds/opt :secretKeyRef) v1/secret-key-selector-spec
   })

(def v1/env-var-source-spec
  (ds/spec
    {:name ::v1/env-var-source
     :spec v1/env-var-source-data}))
