(ns kubernetes.specs.apps/v1beta1/rollback-config
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def apps/v1beta1/rollback-config-data
  {
   (ds/opt :revision) int?
   })

(def apps/v1beta1/rollback-config-spec
  (ds/spec
    {:name ::apps/v1beta1/rollback-config
     :spec apps/v1beta1/rollback-config-data}))
