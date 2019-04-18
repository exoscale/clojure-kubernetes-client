(ns kubernetes.specs.v1/component-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/component-condition-data
  {
   (ds/opt :error) string?
   (ds/opt :message) string?
   (ds/req :status) string?
   (ds/req :type) string?
   })

(def v1/component-condition-spec
  (ds/spec
    {:name ::v1/component-condition
     :spec v1/component-condition-data}))
