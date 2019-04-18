(ns kubernetes.specs.v1beta1/user-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1beta1/user-info-data
  {
   (ds/opt :extra) (s/map-of string? (s/coll-of string?))
   (ds/opt :groups) (s/coll-of string?)
   (ds/opt :uid) string?
   (ds/opt :username) string?
   })

(def v1beta1/user-info-spec
  (ds/spec
    {:name ::v1beta1/user-info
     :spec v1beta1/user-info-data}))
