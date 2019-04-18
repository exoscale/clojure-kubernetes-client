(ns kubernetes.specs.v1beta1/json-schema-props-or-array
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta1/json-schema-props :refer :all]
            [kubernetes.specs.v1beta1/json-schema-props :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/json-schema-props-or-array-data
  {
   (ds/req :JSONSchemas) (s/coll-of v1beta1/json-schema-props-spec)
   (ds/req :Schema) v1beta1/json-schema-props-spec
   })

(def v1beta1/json-schema-props-or-array-spec
  (ds/spec
    {:name ::v1beta1/json-schema-props-or-array
     :spec v1beta1/json-schema-props-or-array-data}))
