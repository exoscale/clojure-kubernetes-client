(ns kubernetes.specs.extensions/v1beta1/rollback-config
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def extensions/v1beta1/rollback-config-data
  {
   (ds/opt :revision) int?
   })

(def extensions/v1beta1/rollback-config-spec
  (ds/spec
    {:name ::extensions/v1beta1/rollback-config
     :spec extensions/v1beta1/rollback-config-data}))
