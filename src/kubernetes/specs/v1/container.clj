(ns kubernetes.specs.v1/container
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/env-var :refer :all]
            [kubernetes.specs.v1/env-from-source :refer :all]
            [kubernetes.specs.v1/lifecycle :refer :all]
            [kubernetes.specs.v1/probe :refer :all]
            [kubernetes.specs.v1/container-port :refer :all]
            [kubernetes.specs.v1/probe :refer :all]
            [kubernetes.specs.v1/resource-requirements :refer :all]
            [kubernetes.specs.v1/security-context :refer :all]
            [kubernetes.specs.v1/volume-device :refer :all]
            [kubernetes.specs.v1/volume-mount :refer :all]
            )
  (:import (java.io File)))


(def v1/container-data
  {
   (ds/opt :args) (s/coll-of string?)
   (ds/opt :command) (s/coll-of string?)
   (ds/opt :env) (s/coll-of v1/env-var-spec)
   (ds/opt :envFrom) (s/coll-of v1/env-from-source-spec)
   (ds/opt :image) string?
   (ds/opt :imagePullPolicy) string?
   (ds/opt :lifecycle) v1/lifecycle-spec
   (ds/opt :livenessProbe) v1/probe-spec
   (ds/req :name) string?
   (ds/opt :ports) (s/coll-of v1/container-port-spec)
   (ds/opt :readinessProbe) v1/probe-spec
   (ds/opt :resources) v1/resource-requirements-spec
   (ds/opt :securityContext) v1/security-context-spec
   (ds/opt :stdin) boolean?
   (ds/opt :stdinOnce) boolean?
   (ds/opt :terminationMessagePath) string?
   (ds/opt :terminationMessagePolicy) string?
   (ds/opt :tty) boolean?
   (ds/opt :volumeDevices) (s/coll-of v1/volume-device-spec)
   (ds/opt :volumeMounts) (s/coll-of v1/volume-mount-spec)
   (ds/opt :workingDir) string?
   })

(def v1/container-spec
  (ds/spec
    {:name ::v1/container
     :spec v1/container-data}))
