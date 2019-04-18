(ns kubernetes.specs.v1alpha1/initializer
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1alpha1/rule :refer :all]
            )
  (:import (java.io File)))


(def v1alpha1/initializer-data
  {
   (ds/req :name) string?
   (ds/opt :rules) (s/coll-of v1alpha1/rule-spec)
   })

(def v1alpha1/initializer-spec
  (ds/spec
    {:name ::v1alpha1/initializer
     :spec v1alpha1/initializer-data}))
