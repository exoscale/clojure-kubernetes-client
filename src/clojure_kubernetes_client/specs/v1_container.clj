(ns clojure-kubernetes-client.specs.v1-container
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-env-var :refer :all]
            [clojure-kubernetes-client.specs.v1-env-from-source :refer :all]
            [clojure-kubernetes-client.specs.v1-lifecycle :refer :all]
            [clojure-kubernetes-client.specs.v1-probe :refer :all]
            [clojure-kubernetes-client.specs.v1-container-port :refer :all]
            [clojure-kubernetes-client.specs.v1-probe :refer :all]
            [clojure-kubernetes-client.specs.v1-resource-requirements :refer :all]
            [clojure-kubernetes-client.specs.v1-security-context :refer :all]
            [clojure-kubernetes-client.specs.v1-probe :refer :all]
            [clojure-kubernetes-client.specs.v1-volume-device :refer :all]
            [clojure-kubernetes-client.specs.v1-volume-mount :refer :all]
            )
  (:import (java.io File)))


(declare v1-container-data v1-container)
(def v1-container-data
  {
   (ds/opt :args) (s/coll-of string?)
   (ds/opt :command) (s/coll-of string?)
   (ds/opt :env) (s/coll-of v1-env-var)
   (ds/opt :envFrom) (s/coll-of v1-env-from-source)
   (ds/opt :image) string?
   (ds/opt :imagePullPolicy) string?
   (ds/opt :lifecycle) v1-lifecycle
   (ds/opt :livenessProbe) v1-probe
   (ds/req :name) string?
   (ds/opt :ports) (s/coll-of v1-container-port)
   (ds/opt :readinessProbe) v1-probe
   (ds/opt :resources) v1-resource-requirements
   (ds/opt :securityContext) v1-security-context
   (ds/opt :startupProbe) v1-probe
   (ds/opt :stdin) boolean?
   (ds/opt :stdinOnce) boolean?
   (ds/opt :terminationMessagePath) string?
   (ds/opt :terminationMessagePolicy) string?
   (ds/opt :tty) boolean?
   (ds/opt :volumeDevices) (s/coll-of v1-volume-device)
   (ds/opt :volumeMounts) (s/coll-of v1-volume-mount)
   (ds/opt :workingDir) string?
   })

(def v1-container
  (ds/spec
    {:name ::v1-container
     :spec v1-container-data}))

