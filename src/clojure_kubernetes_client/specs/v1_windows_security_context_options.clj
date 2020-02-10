(ns clojure-kubernetes-client.specs.v1-windows-security-context-options
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-windows-security-context-options-data v1-windows-security-context-options)
(def v1-windows-security-context-options-data
  {
   (ds/opt :gmsaCredentialSpec) string?
   (ds/opt :gmsaCredentialSpecName) string?
   (ds/opt :runAsUserName) string?
   })

(def v1-windows-security-context-options
  (ds/spec
    {:name ::v1-windows-security-context-options
     :spec v1-windows-security-context-options-data}))

