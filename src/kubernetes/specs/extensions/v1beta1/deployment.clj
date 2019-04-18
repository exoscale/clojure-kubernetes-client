(ns kubernetes.specs.extensions/v1beta1/deployment
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.extensions/v1beta1/deployment-spec :refer :all]
            [kubernetes.specs.extensions/v1beta1/deployment-status :refer :all]
            )
  (:import (java.io File)))


(def extensions/v1beta1/deployment-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) extensions/v1beta1/deployment-spec-spec
   (ds/opt :status) extensions/v1beta1/deployment-status-spec
   })

(def extensions/v1beta1/deployment-spec
  (ds/spec
    {:name ::extensions/v1beta1/deployment
     :spec extensions/v1beta1/deployment-data}))
