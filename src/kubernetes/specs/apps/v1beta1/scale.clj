(ns kubernetes.specs.apps/v1beta1/scale
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.apps/v1beta1/scale-spec :refer :all]
            [kubernetes.specs.apps/v1beta1/scale-status :refer :all]
            )
  (:import (java.io File)))


(def apps/v1beta1/scale-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) apps/v1beta1/scale-spec-spec
   (ds/opt :status) apps/v1beta1/scale-status-spec
   })

(def apps/v1beta1/scale-spec
  (ds/spec
    {:name ::apps/v1beta1/scale
     :spec apps/v1beta1/scale-data}))
