(ns kubernetes.specs.v1beta1/json-schema-props-or-string-array
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta1/json-schema-props :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/json-schema-props-or-string-array-data
  {
   (ds/req :Property) (s/coll-of string?)
   (ds/req :Schema) v1beta1/json-schema-props-spec
   })

(def v1beta1/json-schema-props-or-string-array-spec
  (ds/spec
    {:name ::v1beta1/json-schema-props-or-string-array
     :spec v1beta1/json-schema-props-or-string-array-data}))
