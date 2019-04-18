(ns kubernetes.specs.v1beta1/json
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1beta1/json-data
  {
   (ds/req :Raw) any?
   })

(def v1beta1/json-spec
  (ds/spec
    {:name ::v1beta1/json
     :spec v1beta1/json-data}))
