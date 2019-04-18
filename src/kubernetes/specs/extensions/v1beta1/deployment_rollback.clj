(ns kubernetes.specs.extensions/v1beta1/deployment-rollback
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.extensions/v1beta1/rollback-config :refer :all]
            )
  (:import (java.io File)))


(def extensions/v1beta1/deployment-rollback-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/req :name) string?
   (ds/req :rollbackTo) extensions/v1beta1/rollback-config-spec
   (ds/opt :updatedAnnotations) (s/map-of string? string?)
   })

(def extensions/v1beta1/deployment-rollback-spec
  (ds/spec
    {:name ::extensions/v1beta1/deployment-rollback
     :spec extensions/v1beta1/deployment-rollback-data}))
