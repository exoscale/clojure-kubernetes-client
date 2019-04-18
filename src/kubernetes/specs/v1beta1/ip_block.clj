(ns kubernetes.specs.v1beta1/ip-block
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1beta1/ip-block-data
  {
   (ds/req :cidr) string?
   (ds/opt :except) (s/coll-of string?)
   })

(def v1beta1/ip-block-spec
  (ds/spec
    {:name ::v1beta1/ip-block
     :spec v1beta1/ip-block-data}))
