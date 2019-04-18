(ns kubernetes.specs.v1/network-policy-peer
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/ip-block :refer :all]
            [kubernetes.specs.v1/label-selector :refer :all]
            [kubernetes.specs.v1/label-selector :refer :all]
            )
  (:import (java.io File)))


(def v1/network-policy-peer-data
  {
   (ds/opt :ipBlock) v1/ip-block-spec
   (ds/opt :namespaceSelector) v1/label-selector-spec
   (ds/opt :podSelector) v1/label-selector-spec
   })

(def v1/network-policy-peer-spec
  (ds/spec
    {:name ::v1/network-policy-peer
     :spec v1/network-policy-peer-data}))
