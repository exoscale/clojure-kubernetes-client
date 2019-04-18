(ns kubernetes.specs.v1/pod-template-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1/pod-spec :refer :all]
            )
  (:import (java.io File)))


(def v1/pod-template-spec-data
  {
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) v1/pod-spec-spec
   })

(def v1/pod-template-spec-spec
  (ds/spec
    {:name ::v1/pod-template-spec
     :spec v1/pod-template-spec-data}))
