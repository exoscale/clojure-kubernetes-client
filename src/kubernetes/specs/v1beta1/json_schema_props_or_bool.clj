(ns kubernetes.specs.v1beta1/json-schema-props-or-bool
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta1/json-schema-props :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/json-schema-props-or-bool-data
  {
   (ds/req :Allows) boolean?
   (ds/req :Schema) v1beta1/json-schema-props-spec
   })

(def v1beta1/json-schema-props-or-bool-spec
  (ds/spec
    {:name ::v1beta1/json-schema-props-or-bool
     :spec v1beta1/json-schema-props-or-bool-data}))
