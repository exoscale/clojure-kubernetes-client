(ns kubernetes.specs.v1/pod-template
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1/pod-template-spec :refer :all]
            )
  (:import (java.io File)))


(def v1/pod-template-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :template) v1/pod-template-spec-spec
   })

(def v1/pod-template-spec
  (ds/spec
    {:name ::v1/pod-template
     :spec v1/pod-template-data}))
