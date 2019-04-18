(ns kubernetes.specs.v1alpha1/priority-class
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            )
  (:import (java.io File)))


(def v1alpha1/priority-class-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :description) string?
   (ds/opt :globalDefault) boolean?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/req :value) int?
   })

(def v1alpha1/priority-class-spec
  (ds/spec
    {:name ::v1alpha1/priority-class
     :spec v1alpha1/priority-class-data}))
