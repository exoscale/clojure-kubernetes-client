(ns kubernetes.specs.extensions/v1beta1/scale
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.extensions/v1beta1/scale-spec :refer :all]
            [kubernetes.specs.extensions/v1beta1/scale-status :refer :all]
            )
  (:import (java.io File)))


(def extensions/v1beta1/scale-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) extensions/v1beta1/scale-spec-spec
   (ds/opt :status) extensions/v1beta1/scale-status-spec
   })

(def extensions/v1beta1/scale-spec
  (ds/spec
    {:name ::extensions/v1beta1/scale
     :spec extensions/v1beta1/scale-data}))
