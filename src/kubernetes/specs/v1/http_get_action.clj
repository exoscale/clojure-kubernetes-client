(ns kubernetes.specs.v1/http-get-action
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/http-header :refer :all]
            [kubernetes.specs. :refer :all]
            )
  (:import (java.io File)))


(def v1/http-get-action-data
  {
   (ds/opt :host) string?
   (ds/opt :httpHeaders) (s/coll-of v1/http-header-spec)
   (ds/opt :path) string?
   (ds/req :port) any?
   (ds/opt :scheme) string?
   })

(def v1/http-get-action-spec
  (ds/spec
    {:name ::v1/http-get-action
     :spec v1/http-get-action-data}))
