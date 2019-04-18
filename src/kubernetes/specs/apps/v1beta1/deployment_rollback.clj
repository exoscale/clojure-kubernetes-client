(ns kubernetes.specs.apps/v1beta1/deployment-rollback
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.apps/v1beta1/rollback-config :refer :all]
            )
  (:import (java.io File)))


(def apps/v1beta1/deployment-rollback-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/req :name) string?
   (ds/req :rollbackTo) apps/v1beta1/rollback-config-spec
   (ds/opt :updatedAnnotations) (s/map-of string? string?)
   })

(def apps/v1beta1/deployment-rollback-spec
  (ds/spec
    {:name ::apps/v1beta1/deployment-rollback
     :spec apps/v1beta1/deployment-rollback-data}))
