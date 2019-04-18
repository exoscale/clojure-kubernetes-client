(ns kubernetes.specs.v1/binding
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1/object-reference :refer :all]
            )
  (:import (java.io File)))


(def v1/binding-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/req :target) v1/object-reference-spec
   })

(def v1/binding-spec
  (ds/spec
    {:name ::v1/binding
     :spec v1/binding-data}))
