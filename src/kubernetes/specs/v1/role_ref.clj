(ns kubernetes.specs.v1/role-ref
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/role-ref-data
  {
   (ds/req :apiGroup) string?
   (ds/req :kind) string?
   (ds/req :name) string?
   })

(def v1/role-ref-spec
  (ds/spec
    {:name ::v1/role-ref
     :spec v1/role-ref-data}))
