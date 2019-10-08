
# Changelog
 
Changelog for tomakehurst wiremock.
 
## Unreleased
### GitHub [#1181](https://github.com/tomakehurst/wiremock/issues/1181) [Bug] Reponse Templating for Path doesn&#39;t match while using Json stubbing  
 
**Fixed #1181 - documentation bug showing incorrect use of pathSegments in response templating**
 
 
[989cf4263b9028c](https://github.com/tomakehurst/wiremock/commit/989cf4263b9028c) Tom Akehurst *2019-10-03 07:44:50*
 
 
### GitHub [#1190](https://github.com/tomakehurst/wiremock/issues/1190) Response timeout when HTTPS enabled    *Maybe bug*  
 
**Fixed #1190 - blocked/timed out requests with default (too low) acceptor and container thread counts**
 
 
[cf453ca2e33e2cc](https://github.com/tomakehurst/wiremock/commit/cf453ca2e33e2cc) Tom Akehurst *2019-10-08 08:27:28*
 
 
### GitHub [#1197](https://github.com/tomakehurst/wiremock/issues/1197) Response templating not working with jsonBody in version 2.25.0 standalone    *Bug*  
 
**Fixed #1197 - response templates not rendered when using jsonBody**
 
 
[4c052a31ca4b1c4](https://github.com/tomakehurst/wiremock/commit/4c052a31ca4b1c4) Tom Akehurst *2019-10-03 07:29:35*
 
 
### No issue
 
**Bumped patch version**
 
 
[f27836405bdcbda](https://github.com/tomakehurst/wiremock/commit/f27836405bdcbda) Tom Akehurst *2019-10-02 08:01:11*
 
**Fixed shading for some new dependencies in standalone JAR**
 
 
[c5d457595aac4ab](https://github.com/tomakehurst/wiremock/commit/c5d457595aac4ab) Tom Akehurst *2019-10-02 07:51:24*
 
**Removed 0 Jetty shutdown timeout as this appears to produce bad behaviour in the Java HTTPURLConnection client in some cases**
 
 
[bb1159d56a1f228](https://github.com/tomakehurst/wiremock/commit/bb1159d56a1f228) Tom Akehurst *2019-10-02 07:33:48*
 
**Fixed broken versions in Swagger and doc files**
 
 
[0a0fabdf9b1fb58](https://github.com/tomakehurst/wiremock/commit/0a0fabdf9b1fb58) Tom Akehurst *2019-09-30 10:55:56*
 
**Upped Gradle timeouts to so I can push releases on dodgy networks**
 
 
[4802eb37e6208de](https://github.com/tomakehurst/wiremock/commit/4802eb37e6208de) Tom Akehurst *2019-09-28 12:26:20*
 
 
## 2.25.0
### GitHub [#1075](https://github.com/tomakehurst/wiremock/issues/1075) [Feature request] New template helpers(e.g. hostname) supported for using in container env  
 
**Added hostname and systemValue helpers. See #1075 (#1106)**
 
 * Add Handlebars helpers for fetching system properties, environment variables and the local hostname 
 
[d06f3aa60b9a2a8](https://github.com/tomakehurst/wiremock/commit/d06f3aa60b9a2a8) York *2019-08-28 08:24:31*
 
 
### GitHub [#1106](https://github.com/tomakehurst/wiremock/pull/1106) Added hostname and systemValue helpers. See #1075  
 
**Added hostname and systemValue helpers. See #1075 (#1106)**
 
 * Add Handlebars helpers for fetching system properties, environment variables and the local hostname 
 
[d06f3aa60b9a2a8](https://github.com/tomakehurst/wiremock/commit/d06f3aa60b9a2a8) York *2019-08-28 08:24:31*
 
 
### GitHub [#1171](https://github.com/tomakehurst/wiremock/issues/1171) CVE-2019-14379 + CVE-2019-14439 in jackson datababind  
 
**Bumping jackson-databind version to 2.9.9.3 to fix CVE's (#1172)**
 
 * Fixing CVE&#39;s 
 * Fixing issue #1171 
 
[1880c3e49db05a5](https://github.com/tomakehurst/wiremock/commit/1880c3e49db05a5) kai-eckert *2019-08-12 13:35:44*
 
 
### GitHub [#1172](https://github.com/tomakehurst/wiremock/pull/1172) Bumping jackson-databind version to 2.9.9.3 to fix CVE&#39;s  
 
**Bumping jackson-databind version to 2.9.9.3 to fix CVE's (#1172)**
 
 * Fixing CVE&#39;s 
 * Fixing issue #1171 
 
[1880c3e49db05a5](https://github.com/tomakehurst/wiremock/commit/1880c3e49db05a5) kai-eckert *2019-08-12 13:35:44*
 
 
### GitHub [#1174](https://github.com/tomakehurst/wiremock/issues/1174) Problem with jsonBody and jsonPath in 2.24.x    *Bug*  
 
**Fixed #1174 - prevented NPE being thrown when attempting to use response templates with response bodies supplied via the jsonBody attribute**
 
 
[e967931b09718c5](https://github.com/tomakehurst/wiremock/commit/e967931b09718c5) Tom Akehurst *2019-08-21 21:13:59*
 
 
### GitHub [#1175](https://github.com/tomakehurst/wiremock/issues/1175) Unable to match request using matchingJsonPath() and absent()  
 
**Fixed #1175 - unable to use absent() with matchesJsonPath due to serialisation error**
 
 
[f5e34843cc78720](https://github.com/tomakehurst/wiremock/commit/f5e34843cc78720) Tom Akehurst *2019-09-12 17:49:59*
 
 
### GitHub [#1178](https://github.com/tomakehurst/wiremock/issues/1178) MatchesJsonPathPattern .equals method ignores pattern expression    *Bug*  
 
**Fixed #1178 - equals method for path matchers did not include value pattern**
 
 
[762fa82ade9c7e8](https://github.com/tomakehurst/wiremock/commit/762fa82ade9c7e8) Tom Akehurst *2019-08-27 18:51:52*
 
 
### GitHub [#1179](https://github.com/tomakehurst/wiremock/issues/1179) EOF in inputstream, when when bodyPatterns and multipartPatterns are used    *Bug*  
 
**Fixed #1179 - wwitched request part parsing to use Apache commons fileupload, in order to avoid empty input stream problem with mixed body types**
 
 
[42efe359c9a77ab](https://github.com/tomakehurst/wiremock/commit/42efe359c9a77ab) Tom Akehurst *2019-09-03 18:36:31*
 
 
### GitHub [#1182](https://github.com/tomakehurst/wiremock/pull/1182) Documenting NPM package  
 
**Documenting NPM package (#1182)**
 
 
[8cea0b6e7404ef7](https://github.com/tomakehurst/wiremock/commit/8cea0b6e7404ef7) Tomas Bjerre *2019-09-03 15:20:07*
 
 
### GitHub [#1191](https://github.com/tomakehurst/wiremock/pull/1191) Upgrade Jackson to 2.9.10 (fixing multiple CVEs)  
 
**Jackson version bump (fixing multiple CVEs) (#1191)**
 
 
[89b98398a29a68f](https://github.com/tomakehurst/wiremock/commit/89b98398a29a68f) Xavier Alvarez *2019-09-26 08:39:50*
 
 
### No issue
 
**Tweaked test logging in CI**
 
 
[f7fbb846cd7b259](https://github.com/tomakehurst/wiremock/commit/f7fbb846cd7b259) Tom Akehurst *2019-09-26 08:58:09*
 
**Made junit a compileOnly (provided) dependency to avoid hamcrest class clashes when using newer test libraries**
 
 
[a125dd914d2f5db](https://github.com/tomakehurst/wiremock/commit/a125dd914d2f5db) Tom Akehurst *2019-09-26 08:39:58*
 
**Fixed java7 test broken by littleproxy version switching**
 
 
[b4013ffafc9d86b](https://github.com/tomakehurst/wiremock/commit/b4013ffafc9d86b) Tom Akehurst *2019-09-25 17:59:49*
 
**Added HTTP/2 support in the jre8 version**
 
 
[a2014e3daa573a6](https://github.com/tomakehurst/wiremock/commit/a2014e3daa573a6) Tom Akehurst *2019-09-25 17:49:31*
 
**Added docs for request journal event removal**
 
 
[f0cd8f2d1614fbd](https://github.com/tomakehurst/wiremock/commit/f0cd8f2d1614fbd) Tom Akehurst *2019-09-12 16:56:20*
 
**Added ability to remove serve events by stub metadata**
 
 
[e0c18ef70c9f6e8](https://github.com/tomakehurst/wiremock/commit/e0c18ef70c9f6e8) Tom Akehurst *2019-09-10 08:47:15*
 
**Added ability to remove serve events (logged requests) via a request pattern**
 
 
[5b6a3666f3c04b8](https://github.com/tomakehurst/wiremock/commit/5b6a3666f3c04b8) Tom Akehurst *2019-09-06 18:19:05*
 
**Added ability to remove serve events (logged requests) by ID**
 
 
[25b057aac4083cf](https://github.com/tomakehurst/wiremock/commit/25b057aac4083cf) Tom Akehurst *2019-09-06 17:33:04*
 
**Tweaked permitted keys (response templating) docs**
 
 
[d72b8c65f14bbe9](https://github.com/tomakehurst/wiremock/commit/d72b8c65f14bbe9) Tom Akehurst *2019-08-30 08:39:25*
 
**Some refactorings to the environment and system property helper. Restricted helper's access to vars/props matching wiremock.* by default to avoid accidentally exposing all environment variables.**
 
 
[b4389b8cd709c31](https://github.com/tomakehurst/wiremock/commit/b4389b8cd709c31) Tom Akehurst *2019-08-28 18:21:43*
 
**Bumped minor version**
 
 
[c2d5738c551405d](https://github.com/tomakehurst/wiremock/commit/c2d5738c551405d) Tom Akehurst *2019-08-27 18:00:17*
 
**Shaded the servlet API**
 
 
[eb3e9fc140e4abf](https://github.com/tomakehurst/wiremock/commit/eb3e9fc140e4abf) Tom Akehurst *2019-08-27 17:59:52*
 
**Reverting the Travis build to Trusty to see if this will fix JDK installer failures**
 
 
[59d2f9adf912885](https://github.com/tomakehurst/wiremock/commit/59d2f9adf912885) Tom Akehurst *2019-08-09 17:14:53*
 
 
## 2.24.1
### GitHub [#1160](https://github.com/tomakehurst/wiremock/pull/1160) Upgrade jackson databind to fix CVEs  
 
**Upgrade jackson databind to fix CVEs (#1160)**
 
 
[f07fd6fd7fdc6f3](https://github.com/tomakehurst/wiremock/commit/f07fd6fd7fdc6f3) Xavier Alvarez *2019-07-24 15:19:19*
 
 
### GitHub [#1167](https://github.com/tomakehurst/wiremock/issues/1167) Upgrade jetty to fix CVEs  
 
**Fixed #1167 - Bumped up Jetty versions to latest**
 
 
[fcaa9a632e2a1b0](https://github.com/tomakehurst/wiremock/commit/fcaa9a632e2a1b0) Tom Akehurst *2019-08-06 14:57:44*
 
 
### No issue
 
**Bumped patch version**
 
 
[4d32d926cc7b158](https://github.com/tomakehurst/wiremock/commit/4d32d926cc7b158) Tom Akehurst *2019-08-06 14:58:04*
 
**Added disable gzip docs**
 
 
[463196bd708410c](https://github.com/tomakehurst/wiremock/commit/463196bd708410c) Tom Akehurst *2019-07-18 09:20:02*
 
**Added docs for request filtering**
 
 
[07bbb44562c6b1c](https://github.com/tomakehurst/wiremock/commit/07bbb44562c6b1c) Tom Akehurst *2019-07-18 07:46:10*
 
 
## 2.24.0
### GitHub [#1076](https://github.com/tomakehurst/wiremock/pull/1076) Fixed some small documentation issues.  
 
**Fixed some documentation issues. (#1076)**
 
 
[5275c37967ed927](https://github.com/tomakehurst/wiremock/commit/5275c37967ed927) Renny *2019-06-11 20:41:17*
 
 
### GitHub [#1104](https://github.com/tomakehurst/wiremock/issues/1104) [Feature] Add ability to disable auto compress response of Wiremock bundled in Jetty GzipHandler    *Feature request*  
 
**Fixed #1104 - Added ability to disable gzip**
 
 
[3b46b0bcef963e6](https://github.com/tomakehurst/wiremock/commit/3b46b0bcef963e6) Tom Akehurst *2019-07-17 16:13:03*
 
 
### GitHub [#1116](https://github.com/tomakehurst/wiremock/pull/1116) Apply disableBodyFileTemplating only to body content  
 
**Apply disableBodyFileTemplating only to body content (#1116)**
 
 
[7c5923afc657056](https://github.com/tomakehurst/wiremock/commit/7c5923afc657056) James Treanor *2019-04-19 16:07:54*
 
 
### GitHub [#1117](https://github.com/tomakehurst/wiremock/issues/1117) json body as string in response when adding a mapping with a jsonBody by using the rest api   
 
**#1117 json body as string in response when adding a mapping with a js… (#1118)**
 
 * #1117 json body as string in response when adding a mapping with a jsonBody by using the rest api 
 * make field json final 
 
[6176448ba2a051a](https://github.com/tomakehurst/wiremock/commit/6176448ba2a051a) Jeroen Kops *2019-06-11 19:13:58*
 
 
### GitHub [#1118](https://github.com/tomakehurst/wiremock/pull/1118) #1117 json body as string in response when adding a mapping with a js…  
 
**#1117 json body as string in response when adding a mapping with a js… (#1118)**
 
 * #1117 json body as string in response when adding a mapping with a jsonBody by using the rest api 
 * make field json final 
 
[6176448ba2a051a](https://github.com/tomakehurst/wiremock/commit/6176448ba2a051a) Jeroen Kops *2019-06-11 19:13:58*
 
 
### GitHub [#1119](https://github.com/tomakehurst/wiremock/pull/1119) Updating docs with Wiremock JAX-RS  
 
**Updating docs with Wiremock JAX-RS (#1119)**
 
 
[9d9d73463a82184](https://github.com/tomakehurst/wiremock/commit/9d9d73463a82184) Tomas Bjerre *2019-04-23 09:35:31*
 
 
### GitHub [#1128](https://github.com/tomakehurst/wiremock/issues/1128) Mismatched request with plus character in query param results in 500 response  
 
**Fixed #1128 - 500 response returned when query parameter contains spaces and no stub is matched**
 
 
[9b248e384167b8e](https://github.com/tomakehurst/wiremock/commit/9b248e384167b8e) Tom Akehurst *2019-06-09 19:07:26*
 
 
### GitHub [#1134](https://github.com/tomakehurst/wiremock/pull/1134) Add scenario index on record: differentiates per RequestPattern group  
 
**Add scenario index on record: differentiates per RequestPattern group (#1134)**
 
 * Without this playback gets confused when the same url is 
 * hit (such as is typical with a SOAP API) but groups differently 
 * based on payload or headers. 
 
[a58680b11a0707c](https://github.com/tomakehurst/wiremock/commit/a58680b11a0707c) Adam Davies *2019-07-17 16:23:12*
 
 
### GitHub [#1135](https://github.com/tomakehurst/wiremock/pull/1135) Update docs with how to build standalone jar  
 
**Update README with gradlew invocation required to build standalone jar (#1135)**
 
 
[f236dec94fb1425](https://github.com/tomakehurst/wiremock/commit/f236dec94fb1425) Adam Davies *2019-06-11 19:10:42*
 
 
### GitHub [#1136](https://github.com/tomakehurst/wiremock/issues/1136) DiffLine.anyQuestionsMarksAreEscaped breaks for lines with ? in first two characters  
 
**Fixed #1136 - diff line rendering throws an exception when path is /**
 
 
[d4db4466697f629](https://github.com/tomakehurst/wiremock/commit/d4db4466697f629) Tom Akehurst *2019-06-09 16:30:04*
 
 
### GitHub [#1137](https://github.com/tomakehurst/wiremock/pull/1137) Update jQuery to version 3.4.1 in recorder (CVE-2019-11358)  
 
**Update jQuery to version 3.4.1 in recorder (CVE-2019-11358) (#1137)**
 
 
[cf91e61e3651cde](https://github.com/tomakehurst/wiremock/commit/cf91e61e3651cde) Łukasz Kostrzewa *2019-06-16 20:08:07*
 
 
### GitHub [#1140](https://github.com/tomakehurst/wiremock/pull/1140) Upgrade jackson to avoid CVEs  
 
**Upgrade jackson to avoid CVEs (#1140)**
 
 
[1ba634bdb676e8a](https://github.com/tomakehurst/wiremock/commit/1ba634bdb676e8a) Xavier Alvarez *2019-06-24 09:23:25*
 
 
### GitHub [#1144](https://github.com/tomakehurst/wiremock/issues/1144) NPE when using withRequestBody(absent()) in verification    *Bug*  
 
**Fixed #1144 - NPE thrown from the diff renderer when verifying an absent body**
 
 
[eac0bfa811d3612](https://github.com/tomakehurst/wiremock/commit/eac0bfa811d3612) Tom Akehurst *2019-06-30 17:00:52*
 
 
### Jira CVE-2019   
 
**Update jQuery to version 3.4.1 in recorder (CVE-2019-11358) (#1137)**
 
 
[cf91e61e3651cde](https://github.com/tomakehurst/wiremock/commit/cf91e61e3651cde) Łukasz Kostrzewa *2019-06-16 20:08:07*
 
 
### No issue
 
**Added missing copyright headers**
 
 
[496aec4666de910](https://github.com/tomakehurst/wiremock/commit/496aec4666de910) Tom Akehurst *2019-07-03 08:16:04*
 
**Added a before listener method for global settings, allowing changes to be vetoed**
 
 
[d9cfd040ac86f48](https://github.com/tomakehurst/wiremock/commit/d9cfd040ac86f48) Tom Akehurst *2019-07-02 08:28:28*
 
**Bumped up minor version**
 
 
[29cf401d0238f2f](https://github.com/tomakehurst/wiremock/commit/29cf401d0238f2f) Tom Akehurst *2019-06-16 19:49:37*
 
**Fixed a bug causing a 500 to be returned when a plus is present in a query parameter and running in Java 8/Jetty 9.4+**
 
 
[87af1c9bcf0287f](https://github.com/tomakehurst/wiremock/commit/87af1c9bcf0287f) Tom Akehurst *2019-06-16 19:46:14*
 
**Added a test case for Content-Length being correctly returned for gzipped responses**
 
 
[89c747faefa2c6f](https://github.com/tomakehurst/wiremock/commit/89c747faefa2c6f) Tom Akehurst *2019-06-16 19:16:38*
 
**Added ability to patch extended global settings**
 
 
[828af52f6ed2a2b](https://github.com/tomakehurst/wiremock/commit/828af52f6ed2a2b) Tom Akehurst *2019-06-13 19:28:25*
 
**Added the ability to PUT global settings in a wrapper JSON object**
 
 
[ba4ec4dd0ad2e42](https://github.com/tomakehurst/wiremock/commit/ba4ec4dd0ad2e42) Tom Akehurst *2019-06-13 18:53:56*
 
**Added methods to Metadata for conversion to and from an arbitrary object**
 
 
[b23d54a1be5a1a9](https://github.com/tomakehurst/wiremock/commit/b23d54a1be5a1a9) Tom Akehurst *2019-06-13 18:33:31*
 
**Empty or null stub IDs in JSON are now treated as absent, so that an ID is generated**
 
 
[5fac15f7fb527da](https://github.com/tomakehurst/wiremock/commit/5fac15f7fb527da) Tom Akehurst *2019-06-06 19:50:27*
 
**Added cookie removal builder method to RequestWrapper**
 
 
[28a6ec549a8da76](https://github.com/tomakehurst/wiremock/commit/28a6ec549a8da76) Tom Akehurst *2019-06-06 19:19:52*
 
**Added a builder to RequestWrapper to facilite common transformations**
 
 
[96f118ee96f07fb](https://github.com/tomakehurst/wiremock/commit/96f118ee96f07fb) Tom Akehurst *2019-06-06 19:13:01*
 
**Added support for applying request filters to admin (in addition to stubs)**
 
 
[5accd88d6f77627](https://github.com/tomakehurst/wiremock/commit/5accd88d6f77627) Tom Akehurst *2019-06-04 16:49:12*
 
**Added a request filter extension point, currently only supporting filtering of stub requests (not admin)**
 
 
[7926c5d7ddf5ac8](https://github.com/tomakehurst/wiremock/commit/7926c5d7ddf5ac8) Tom Akehurst *2019-06-03 21:51:04*
 
**Added ability to throw an exception from a stub lifecycle listener causing the action to be vetoed and a sensible error returned to the caller**
 
 
[bb098e09a806874](https://github.com/tomakehurst/wiremock/commit/bb098e09a806874) Tom Akehurst *2019-05-18 20:52:28*
 
**Extended StubLifecycleListener to support callbacks before, in addition to after lifecycle events**
 
 
[202f85e068fcb56](https://github.com/tomakehurst/wiremock/commit/202f85e068fcb56) Tom Akehurst *2019-05-18 20:52:28*
 
 
## 2.23.2
### GitHub [#1114](https://github.com/tomakehurst/wiremock/issues/1114) 422 response returned when attempting to import from JSON with unknown fields  
 
**Fixed #1114 - multi stub import fails when unknown JSON elements are present**
 
 
[43debd2d906db6c](https://github.com/tomakehurst/wiremock/commit/43debd2d906db6c) Tom Akehurst *2019-04-14 17:17:57*
 
 
### No issue
 
**Bumped patch version**
 
 
[7b577fdbc84540c](https://github.com/tomakehurst/wiremock/commit/7b577fdbc84540c) Tom Akehurst *2019-04-14 17:18:11*
 
 
## 2.23.1
### GitHub [#1113](https://github.com/tomakehurst/wiremock/issues/1113) NPE thrown when deleteAllNotInImport not specified in import JSON    *Bug*  
 
**Fixed #1113 - NPE thrown when attempting to import multiple stubs via the API with no import options**
 
 
[47eea2832b87142](https://github.com/tomakehurst/wiremock/commit/47eea2832b87142) Tom Akehurst *2019-04-14 16:56:22*
 
 
### No issue
 
**Bumped patch version**
 
 
[f6944afdc473f17](https://github.com/tomakehurst/wiremock/commit/f6944afdc473f17) Tom Akehurst *2019-04-14 16:56:47*
 
**Added doc note to response templating article about eq helper with one-or-many values**
 
 
[eabd3d2ee53b844](https://github.com/tomakehurst/wiremock/commit/eabd3d2ee53b844) Tom Akehurst *2019-04-14 16:48:13*
 
**Documented template cache settings**
 
 
[ae591bd772de564](https://github.com/tomakehurst/wiremock/commit/ae591bd772de564) Tom Akehurst *2019-04-14 16:43:32*
 
**Added documentation for new handlebars helpers**
 
 
[55dd5f2a34b7850](https://github.com/tomakehurst/wiremock/commit/55dd5f2a34b7850) Tom Akehurst *2019-04-14 16:29:19*
 
 
## 2.23.0
### GitHub [#1025](https://github.com/tomakehurst/wiremock/issues/1025) Fail-safe behavior if json mapping file is not valid    *Feature request*  
 
**Fail-safe behavior if json mapping file is not valid (#1093)**
 
 * Fix #1025 
 
[70b72b28c36004f](https://github.com/tomakehurst/wiremock/commit/70b72b28c36004f) Philippe GRANET *2019-04-13 19:02:24*
 
 
### GitHub [#1044](https://github.com/tomakehurst/wiremock/issues/1044) ProxyResponseDefinitionBuilder constructor doesn&#39;t copy transformerParameters    *Bug*  
 
**Fixed #1044 - added missing copied fields in ProxyResponseDefinitionBuilder constructor**
 
 
[7fbf74fd4d7c5ac](https://github.com/tomakehurst/wiremock/commit/7fbf74fd4d7c5ac) Tom Akehurst *2019-01-04 16:24:14*
 
 
### GitHub [#1048](https://github.com/tomakehurst/wiremock/issues/1048) Xpath matcher poor performance  
 
**Added XML transformer loading optimisations suggested by @philippe-granet in #1048**
 
 
[50c07ef33ad4430](https://github.com/tomakehurst/wiremock/commit/50c07ef33ad4430) Tom Akehurst *2019-01-04 17:49:43*
 
 
### GitHub [#1049](https://github.com/tomakehurst/wiremock/pull/1049) Don&#39;t try to parse non XML value in XPath matcher  
 
**Don't try to parse non XML value in XPath matcher (#1049)**
 
 * For better performance, don&#39;t try to parse non-XML values in the XPath matcher 
 
[076244bb07717e7](https://github.com/tomakehurst/wiremock/commit/076244bb07717e7) Philippe GRANET *2019-01-13 21:30:24*
 
 
### GitHub [#1065](https://github.com/tomakehurst/wiremock/pull/1065) For performance reason, don&#39;t try to parse XML value in MatchesJsonPathPattern  
 
**For performance reason, don't try to parse XML value in MatchesJsonPathPattern (#1065)**
 
 
[3cf0074d11f985d](https://github.com/tomakehurst/wiremock/commit/3cf0074d11f985d) Philippe GRANET *2019-02-11 19:02:31*
 
 
### GitHub [#1093](https://github.com/tomakehurst/wiremock/pull/1093) Print explicit error into log with file name if json mapping file is not valid  
 
**Fail-safe behavior if json mapping file is not valid (#1093)**
 
 * Fix #1025 
 
[70b72b28c36004f](https://github.com/tomakehurst/wiremock/commit/70b72b28c36004f) Philippe GRANET *2019-04-13 19:02:24*
 
 
### GitHub [#1096](https://github.com/tomakehurst/wiremock/pull/1096) Fix XML bad performances on matching XPath  
 
**Put DocumentBuilderFactory and DocumentBuilder in ThreadLocal cache (#1096)**
 
 
[46d3faa917b600f](https://github.com/tomakehurst/wiremock/commit/46d3faa917b600f) Philippe GRANET *2019-04-13 18:54:03*
 
 
### GitHub [#1103](https://github.com/tomakehurst/wiremock/issues/1103) Standalone jar services are not relocated properly    *Bug*  
 
**Fixed #1103 - XMLUnit placeholder service entry in META-INF not correctly re-written in shaded JAR**
 
 
[1d52d0528408c7c](https://github.com/tomakehurst/wiremock/commit/1d52d0528408c7c) Tom Akehurst *2019-04-13 20:27:11*
 
 
### GitHub [#1111](https://github.com/tomakehurst/wiremock/pull/1111) Add support for unix timestamp in seconds  
 
**Add support for unix timestamp in seconds (#1111)**
 
 * Added support for unix timestamp in seconds 
 * Adjusted documentation to add information about UNIX timestamp in seconds 
 * Define constant for 1000L to divide milliseconds to get seconds 
 
[ae13b52df9c0bd9](https://github.com/tomakehurst/wiremock/commit/ae13b52df9c0bd9) James Titcumb *2019-04-13 18:59:45*
 
 
### GitHub [#950](https://github.com/tomakehurst/wiremock/issues/950) Feature request: Support handlebars templates in body file paths    *Feature request*  
 
**fix for #950 - supporting handlebars templates in body file paths**
 
 
[8a25659f2f85453](https://github.com/tomakehurst/wiremock/commit/8a25659f2f85453) Prateek Jain *2018-06-12 18:24:05*
 
 
### GitHub [#974](https://github.com/tomakehurst/wiremock/issues/974) OWASP-vulnerability in WireMock-2.18.0 on jackson-databind    *Bug*  
 
**Fixed #974 by upgrading to jackson-databind 2.8.11.2**
 
 
[085b6f17423b019](https://github.com/tomakehurst/wiremock/commit/085b6f17423b019) Tom Akehurst *2018-08-15 16:41:18*
 
 
### No issue
 
**Bumped minor version**
 
 
[b2c297647b9687e](https://github.com/tomakehurst/wiremock/commit/b2c297647b9687e) Tom Akehurst *2019-04-13 20:29:35*
 
**Added the ability to disable templating of body files when templating is enabled for other fields**
 
 
[3bea8e51df377f3](https://github.com/tomakehurst/wiremock/commit/3bea8e51df377f3) Tom Akehurst *2019-04-13 18:49:16*
 
**Made max template cache entries configurable via the command line**
 
 
[6f791e4c83dfe60](https://github.com/tomakehurst/wiremock/commit/6f791e4c83dfe60) Tom Akehurst *2019-04-13 18:00:58*
 
**Added ability to limit the template cache size**
 
 
[98e1cd5027e4e61](https://github.com/tomakehurst/wiremock/commit/98e1cd5027e4e61) Tom Akehurst *2019-04-13 17:48:40*
 
**Added response template caching for improved performance under load**
 
 
[2e92e590920a39a](https://github.com/tomakehurst/wiremock/commit/2e92e590920a39a) Tom Akehurst *2019-04-13 16:55:08*
 
**Removed stub lifecycle listener callback for resetToDefaults and added old stub mapping to the parameters passed to the edit callback**
 
 
[c9cd2482a500899](https://github.com/tomakehurst/wiremock/commit/c9cd2482a500899) Tom Akehurst *2019-04-13 14:02:05*
 
**Added copyright header**
 
 
[afefbee7c26d6ed](https://github.com/tomakehurst/wiremock/commit/afefbee7c26d6ed) Tom Akehurst *2019-04-12 16:31:01*
 
**Added a test case in support of template performance optimisation (only templating between first and last delimters)**
 
 
[9b3a1ecc8cab937](https://github.com/tomakehurst/wiremock/commit/9b3a1ecc8cab937) Tom Akehurst *2019-04-12 16:30:35*
 
**Made the handlebars JSONPath helper support objects in addition to strings**
 
 
[ae3507166bb05ff](https://github.com/tomakehurst/wiremock/commit/ae3507166bb05ff) Tom Akehurst *2019-04-12 08:53:24*
 
**Added a global settings update extension point**
 
 
[ae9b6055c657176](https://github.com/tomakehurst/wiremock/commit/ae9b6055c657176) Tom Akehurst *2019-04-11 20:05:18*
 
**Added ability to get global settings, update them all at the same time via Java and update them via a PUT to the admin API. Added extended configuration to global settings.**
 
 
[79a7cb6ac79cac2](https://github.com/tomakehurst/wiremock/commit/79a7cb6ac79cac2) Tom Akehurst *2019-04-10 18:27:02*
 
**Added a stub lifecycle event listener extension point**
 
 
[fe235613a85c47f](https://github.com/tomakehurst/wiremock/commit/fe235613a85c47f) Tom Akehurst *2019-04-10 17:56:45*
 
**Added first, last and end offset accessors to ListOrSingle to be used in templates**
 
 
[3ecb4c16fa74217](https://github.com/tomakehurst/wiremock/commit/3ecb4c16fa74217) Tom Akehurst *2019-04-09 19:02:38*
 
**Reworked formField helper into formdata - now extracts form data as a map rather than just returning one field, and supports multiple values for the same key**
 
 
[70b962fdfac8a15](https://github.com/tomakehurst/wiremock/commit/70b962fdfac8a15) Tom Akehurst *2019-04-09 18:53:37*
 
**Added regex extract, form, base64, URL encoding, string trim and size handlebars helpers**
 
 
[b7ef9b7f7697c13](https://github.com/tomakehurst/wiremock/commit/b7ef9b7f7697c13) Tom Akehurst *2019-04-09 08:19:32*
 
**Remove implementing Template**
 
 
[d3c296133301986](https://github.com/tomakehurst/wiremock/commit/d3c296133301986) Philippe GRANET *2019-02-22 22:25:22*
 
**Only template datas between first '{{' and last '}}'**
 
 
[b46b4454a9dfbf5](https://github.com/tomakehurst/wiremock/commit/b46b4454a9dfbf5) Philippe GRANET *2019-02-21 23:39:31*
 
**Enhanced multithreaded test case to include a verify call**
 
 
[dc9e534337195c3](https://github.com/tomakehurst/wiremock/commit/dc9e534337195c3) Tom Akehurst *2019-02-19 19:46:31*
 
**Documented multi stub file and import features**
 
 
[5608342f1ef244e](https://github.com/tomakehurst/wiremock/commit/5608342f1ef244e) Tom Akehurst *2019-02-15 10:43:58*
 
**Updated stub import test cases to use builder overload of import methods**
 
 
[4622c474fad8557](https://github.com/tomakehurst/wiremock/commit/4622c474fad8557) Tom Akehurst *2019-02-14 19:35:12*
 
**Added an admin API test case for importing**
 
 
[51905fa3273fd91](https://github.com/tomakehurst/wiremock/commit/51905fa3273fd91) Tom Akehurst *2019-02-14 19:29:50*
 
**Switched to a more DSL style for stub imports**
 
 
[162c7efe61ee1f8](https://github.com/tomakehurst/wiremock/commit/162c7efe61ee1f8) Tom Akehurst *2019-02-14 19:15:45*
 
**Added support for importing multiple stubs in one request**
 
 
[1851b61cef86928](https://github.com/tomakehurst/wiremock/commit/1851b61cef86928) Tom Akehurst *2019-02-13 19:58:16*
 
**Added support for read-only multi-stub JSON files**
 
 
[abfe4e6340fb5ce](https://github.com/tomakehurst/wiremock/commit/abfe4e6340fb5ce) Tom Akehurst *2019-02-13 10:57:43*
 
**Fixed build issue - moved API doc generation to allprojects block so that build doesn't fail due to missing Swagger spec**
 
 
[6ecb765ed9a67b3](https://github.com/tomakehurst/wiremock/commit/6ecb765ed9a67b3) Tom Akehurst *2019-02-13 10:52:21*
 
**Enabling info logging in Travis config**
 
 
[1a43624e867896f](https://github.com/tomakehurst/wiremock/commit/1a43624e867896f) Tom Akehurst *2019-02-11 19:17:25*
 
**Made JettyUtils work with both Java 7 and Java 8**
 
 
[615a621d350174f](https://github.com/tomakehurst/wiremock/commit/615a621d350174f) Tom Akehurst *2019-02-11 19:01:07*
 
**Tweaked some XML placeholder tests, mainly for style. Tweaked some doc wording.**
 
 
[d345731a7b7af2b](https://github.com/tomakehurst/wiremock/commit/d345731a7b7af2b) Tom Akehurst *2019-02-11 18:42:54*
 
**Support XMLUnit placeholders in EqualToXmlPattern**
 
 
[7f92d26039398ef](https://github.com/tomakehurst/wiremock/commit/7f92d26039398ef) Zheng Wang *2019-02-11 18:00:06*
 
**Fixed shadow JAR problems caused by asm upgrade**
 
 
[c21e66752996e56](https://github.com/tomakehurst/wiremock/commit/c21e66752996e56) Tom Akehurst *2019-01-30 20:45:34*
 
**Fix CaseInsensitiveKey.hashCode() performance**
 
 * - Cache the hash code 
 * - don&#39;t use String.hashCode() which create new String 
 
[e07b0ceeac24c55](https://github.com/tomakehurst/wiremock/commit/e07b0ceeac24c55) Philippe GRANET *2019-01-17 01:02:09*
 
**Fix high CPU load**
 
 * - Replace *.toLowerCase().equals(*.toLowerCase()) by *.equalsIgnoreCase(*) 
 * - detect if we are in Jetty only once 
 * - optimize JettyUtils.getUri() method 
 
[564c45c0509e0a8](https://github.com/tomakehurst/wiremock/commit/564c45c0509e0a8) Philippe GRANET *2019-01-15 02:18:32*
 
**Add link to WireMock Maven Plugin**
 
 
[14aefd3fec1fd60](https://github.com/tomakehurst/wiremock/commit/14aefd3fec1fd60) Ireneusz Pastusiak *2019-01-06 11:57:20*
 
**Fixed a build deprecation warning by removing << from task defs**
 
 
[68be697fce8caea](https://github.com/tomakehurst/wiremock/commit/68be697fce8caea) Tom Akehurst *2019-01-04 22:02:44*
 
**Added to the response headers doc example to show how to send multi-valued response headers**
 
 
[fea7cde3c3a6f05](https://github.com/tomakehurst/wiremock/commit/fea7cde3c3a6f05) Tom Akehurst *2019-01-04 20:12:15*
 
**Upgraded to httpclient 4.5.6**
 
 
[a05ce9f549d8041](https://github.com/tomakehurst/wiremock/commit/a05ce9f549d8041) Tom Akehurst *2019-01-04 20:05:04*
 
**Upgraded to Jackson Databind 2.8.11.3**
 
 
[3dc43890b56ae73](https://github.com/tomakehurst/wiremock/commit/3dc43890b56ae73) Tom Akehurst *2019-01-04 20:03:46*
 
**Upgraded Jetty to version 9.2.26.v20180806**
 
 
[78040510a6bb3e7](https://github.com/tomakehurst/wiremock/commit/78040510a6bb3e7) Tom Akehurst *2019-01-04 20:00:21*
 
**Commented out the Google page hiding snippet to avoid loading delays in the presence of ad blockers**
 
 
[2ace35b0e27b019](https://github.com/tomakehurst/wiremock/commit/2ace35b0e27b019) Tom Akehurst *2019-01-04 17:19:29*
 
**Added a test case for conditional Handlebars helpers**
 
 
[aeb0b26c907cbd3](https://github.com/tomakehurst/wiremock/commit/aeb0b26c907cbd3) Tom Akehurst *2019-01-04 16:14:45*
 
**Tidied up doc note about HTTP/HTTPS port numbers in standalone**
 
 
[90d031fea47a4e1](https://github.com/tomakehurst/wiremock/commit/90d031fea47a4e1) Tom Akehurst *2019-01-04 16:13:06*
 
**edited the usage of --https-port option**
 
 
[395bd9cf3546808](https://github.com/tomakehurst/wiremock/commit/395bd9cf3546808) Pradeep *2018-12-29 09:49:01*
 
**Removed Consulting Services nav link from website**
 
 
[34d1a911746e5ad](https://github.com/tomakehurst/wiremock/commit/34d1a911746e5ad) Tom Akehurst *2018-12-22 18:27:11*
 
**Fix whitespace issue**
 
 
[02dd7e5205addcc](https://github.com/tomakehurst/wiremock/commit/02dd7e5205addcc) Ireneusz Pastusiak *2018-08-19 10:13:39*
 
**Remove temporal coupling between run() and isRunning()**
 
 
[827fa95b4cc873b](https://github.com/tomakehurst/wiremock/commit/827fa95b4cc873b) Ireneusz Pastusiak *2018-08-19 10:08:17*
 
**Added token authentication support**
 
 
[f965f055f54e174](https://github.com/tomakehurst/wiremock/commit/f965f055f54e174) Tom Akehurst *2018-08-15 12:24:42*
 
**Fixed path/pathSegments response templating documentation bug**
 
 
[870ca8bd9a912bc](https://github.com/tomakehurst/wiremock/commit/870ca8bd9a912bc) Tom Akehurst *2018-08-15 12:10:51*
 
**Enabled gzip for additional HTTP methods**
 
 
[df78bfca6d59d47](https://github.com/tomakehurst/wiremock/commit/df78bfca6d59d47) Tom Akehurst *2018-08-15 12:09:20*
 
**Do not fail in case of multipart/mixed requests. The underlying jetty code does only support multipart/form-data. Any other multipart content like multipart/mixed can not be used with the MultipartValuePattern!**
 
 
[d52f25dd845a45b](https://github.com/tomakehurst/wiremock/commit/d52f25dd845a45b) bdannemann *2018-08-03 08:59:38*
 
**Added a large stubs GET scenario**
 
 
[1d1f03e6b91fc9e](https://github.com/tomakehurst/wiremock/commit/1d1f03e6b91fc9e) Tom Akehurst *2018-07-29 12:01:49*
 
**Updated MockLab homepage copy as per winning a/b variant**
 
 
[91f81ca0185caa7](https://github.com/tomakehurst/wiremock/commit/91f81ca0185caa7) Tom Akehurst *2018-07-25 15:32:22*
 
**Added a link to the Paypal blog post on www.mocklab.io**
 
 
[7582794fc71d17b](https://github.com/tomakehurst/wiremock/commit/7582794fc71d17b) Tom Akehurst *2018-07-13 18:57:44*
 
**Minor fix to load test - avoid accidental 200s when should be 404**
 
 
[ee596fe509b46f4](https://github.com/tomakehurst/wiremock/commit/ee596fe509b46f4) Tom Akehurst *2018-07-13 18:21:17*
 
**Added spock extension as external resource to the docs.**
 
 
[00fe6b124156ed3](https://github.com/tomakehurst/wiremock/commit/00fe6b124156ed3) Felipe Fernández *2018-07-02 14:20:58*
 
**Dropped repeats in perf tests for more precise control of rate**
 
 
[cc49a1848e262cd](https://github.com/tomakehurst/wiremock/commit/cc49a1848e262cd) Tom Akehurst *2018-06-24 08:48:37*
 
**Added default 404 stub to perf test setup**
 
 
[e4f9d218379d07e](https://github.com/tomakehurst/wiremock/commit/e4f9d218379d07e) Tom Akehurst *2018-06-24 08:46:44*
 
**Added a better label to perf test scenario step**
 
 
[d0a9c7771814860](https://github.com/tomakehurst/wiremock/commit/d0a9c7771814860) Tom Akehurst *2018-06-24 07:57:07*
 
**Added checking of 404s in the many GETs perf test scenario**
 
 
[48109cdd26ad2f0](https://github.com/tomakehurst/wiremock/commit/48109cdd26ad2f0) Tom Akehurst *2018-06-24 07:49:50*
 
**Added a many GETs load test scenario**
 
 
[aa8b99bc30743ff](https://github.com/tomakehurst/wiremock/commit/aa8b99bc30743ff) Tom Akehurst *2018-06-23 15:27:15*
 
**Added a conf file to the perf test to shorten some timeouts**
 
 
[a8aa9f84a1dbcf4](https://github.com/tomakehurst/wiremock/commit/a8aa9f84a1dbcf4) Tom Akehurst *2018-06-23 14:30:37*
 
**Added environment parameterisation to perf test**
 
 
[d421d8f0d0c049a](https://github.com/tomakehurst/wiremock/commit/d421d8f0d0c049a) Tom Akehurst *2018-06-23 12:04:23*
 
**Fixes to parameterisation of perf test**
 
 
[7392e049e0190c7](https://github.com/tomakehurst/wiremock/commit/7392e049e0190c7) Tom Akehurst *2018-06-23 12:04:23*
 
**Fix build (tests) for users having a non-English default locale**
 
 * The tests AdminApiTest and EqualToXmlPatternTest assert English XML parser 
 * error messages. To make those tests succeed for users having a non-English 
 * default locale we set the default locale to English in those tests. 
 * We refrain from setting the system property user.language in build.gradle 
 * because that would only fix the tests when run from the command line, not when 
 * run from some IDE. 
 
[b5d1a572006f9e0](https://github.com/tomakehurst/wiremock/commit/b5d1a572006f9e0) Jan Bretschneider *2018-06-08 19:31:37*
 
 
## 2.22.0
### GitHub [#1089](https://github.com/tomakehurst/wiremock/issues/1089) POM of 2.21.0 JRE 8 looks odd    *Bug*  
 
**Fixed #1089 - jre8 pom contained both Java 7 and 8 depedencies**
 
 
[e8f929b34fe659f](https://github.com/tomakehurst/wiremock/commit/e8f929b34fe659f) Tom Akehurst *2019-03-10 15:18:17*
 
 
### GitHub [#1098](https://github.com/tomakehurst/wiremock/pull/1098) Replace usage of internal java.xml class with public abstraction  
 
**Replace usage of internal java.xml class with public abstraction (#1098)**
 
 * This commit fixes problem of using DocumentBuilderFactoryImpl from com.sun.org.apache.xerces.internal.jaxp package. Problem arises as this package is not public (not exported) since JDK 9. Solution is to replace use of this class with DocumentBuilderFactory from exported package java.xml.parsers. 
 
[54f500acbfa6d2e](https://github.com/tomakehurst/wiremock/commit/54f500acbfa6d2e) Krzysztof Buszowski *2019-03-17 20:51:41*
 
 
### No issue
 
**Bumped minor version**
 
 
[6abccfbe6a92d88](https://github.com/tomakehurst/wiremock/commit/6abccfbe6a92d88) Tom Akehurst *2019-03-17 21:26:31*
 
**Added a template method to ResponseTemplateTransformer allowing a subclass to supply extra model elements**
 
 
[a2586ae762cc386](https://github.com/tomakehurst/wiremock/commit/a2586ae762cc386) Tom Akehurst *2019-03-17 21:21:36*
 
**Attempt to fix Travis build failures by switching test truststore based on JVM version**
 
 
[739999f470c29e1](https://github.com/tomakehurst/wiremock/commit/739999f470c29e1) Tom Akehurst *2019-03-16 20:24:59*
 
**3rd attempt at upgrading openjdk7 in Travis to avoid build failures due to keystore type**
 
 
[bad5c7f8da2c9ea](https://github.com/tomakehurst/wiremock/commit/bad5c7f8da2c9ea) Tom Akehurst *2019-03-16 20:08:26*
 
**Added some debug output to the travis config**
 
 
[8f413ba6179c57b](https://github.com/tomakehurst/wiremock/commit/8f413ba6179c57b) Tom Akehurst *2019-03-16 19:59:55*
 
**2nd attempt at upgrading openjdk7 in Travis to avoid build failures due to keystore type**
 
 
[1cbfcab5c80ec12](https://github.com/tomakehurst/wiremock/commit/1cbfcab5c80ec12) Tom Akehurst *2019-03-16 19:53:37*
 
**Added missing sudo to package upgrade command in the Travis config**
 
 
[36c9e1c4b99464f](https://github.com/tomakehurst/wiremock/commit/36c9e1c4b99464f) Tom Akehurst *2019-03-16 19:47:23*
 
**Attempt at upgrading openjdk7 in Travis to avoid build failures due to keystore type**
 
 
[85760b7ee65d57a](https://github.com/tomakehurst/wiremock/commit/85760b7ee65d57a) Tom Akehurst *2019-03-16 19:44:13*
 
**Added some diagnostic info to the Travis config**
 
 
[681833e5a0723cb](https://github.com/tomakehurst/wiremock/commit/681833e5a0723cb) Tom Akehurst *2019-03-16 19:11:47*
 
**Deleted flakey and not terribly useful test**
 
 
[79d878845ba8181](https://github.com/tomakehurst/wiremock/commit/79d878845ba8181) Tom Akehurst *2019-03-16 18:45:24*
 
**Slightly raised a timeout in a test to reduce build flakeyness**
 
 
[fec9ecd4cefde98](https://github.com/tomakehurst/wiremock/commit/fec9ecd4cefde98) Tom Akehurst *2019-03-16 18:30:34*
 
**Re-generated the test truststore using Java 7 to attempt to fix Travis Java 7 build failures.**
 
 
[84d531f6ec802db](https://github.com/tomakehurst/wiremock/commit/84d531f6ec802db) Tom Akehurst *2019-03-16 18:29:50*
 
**Try multiple times to start on a random port during WAR test as this sometimes fails on Travis due to BindExceptions**
 
 
[88bbe7fb2160bbc](https://github.com/tomakehurst/wiremock/commit/88bbe7fb2160bbc) Tom Akehurst *2019-03-16 18:17:31*
 
**Documented transfer encoding configuration settings**
 
 
[7a63912921777a1](https://github.com/tomakehurst/wiremock/commit/7a63912921777a1) Tom Akehurst *2019-03-16 09:37:59*
 
**Added support for specifying a policy determining whether responses should be chunk encoded or returned with a Content-Length header**
 
 
[2de7889415b6a45](https://github.com/tomakehurst/wiremock/commit/2de7889415b6a45) Tom Akehurst *2019-03-14 11:21:19*
 
**WIP**
 
 
[52c9dddcb4f71e5](https://github.com/tomakehurst/wiremock/commit/52c9dddcb4f71e5) Tom Akehurst *2019-03-13 09:41:18*
 
**Added a doc note about building client certificates with SANs**
 
 
[b9eb5cc56c9d7ff](https://github.com/tomakehurst/wiremock/commit/b9eb5cc56c9d7ff) Tom Akehurst *2019-03-12 18:13:37*
 
**Fixed some minor issues with the example client cert/truststore creation script**
 
 
[b27187e0434d817](https://github.com/tomakehurst/wiremock/commit/b27187e0434d817) Tom Akehurst *2019-03-12 11:38:42*
 
**Upgraded the jre8 build to Jetty 9.4.15.v20190215**
 
 
[e68f0c6463b14f6](https://github.com/tomakehurst/wiremock/commit/e68f0c6463b14f6) Tom Akehurst *2019-03-12 11:32:58*
 
**Fixed ./serve.sh so that API docs are built first**
 
 
[4f83a6dc4e147c1](https://github.com/tomakehurst/wiremock/commit/4f83a6dc4e147c1) Tom Akehurst *2019-02-21 19:23:27*
 
**Tweaked Swagger doc tag names**
 
 
[a24e3cd7f38b733](https://github.com/tomakehurst/wiremock/commit/a24e3cd7f38b733) Tom Akehurst *2019-02-21 19:18:12*
 
**Upgraded to latest redoc**
 
 
[981881404784286](https://github.com/tomakehurst/wiremock/commit/981881404784286) Tom Akehurst *2019-02-21 19:16:32*
 
**Increased test timeout value in an attempt to avoid CI flakeyness**
 
 
[0205a0b699d8659](https://github.com/tomakehurst/wiremock/commit/0205a0b699d8659) Tom Akehurst *2019-02-21 15:17:27*
 
**Increased test timeout value in an attempt to avoid CI flakeyness**
 
 
[33c4cd652074a79](https://github.com/tomakehurst/wiremock/commit/33c4cd652074a79) Tom Akehurst *2019-02-21 15:17:12*
 
**Switch from raml2html to ReDoc**
 
 * This updates http://wiremock.org/docs/api/ to use ReDoc instead of 
 * raml2html, since the RAML spec is going to be removed, and ReDoc is much 
 * nicer. Since ReDoc takes up quite a bit horizontal space, I switched the 
 * page layout to &quot;splash&quot; to hide the left menu. 
 
[f6ffd07359d40ab](https://github.com/tomakehurst/wiremock/commit/f6ffd07359d40ab) Mason Malone *2018-11-30 07:14:17*
 
**Add independent OpenAPI 3 spec**
 
 * This adds an OpenAPI 3.0 spec and uses it to generate the swagger.json 
 * file, instead of converting the RAML spec to Swagger 2.0 with 
 * `api-spec-converter`. OpenAPI is more flexible and solves conversion 
 * issues involving the `$ref` elements.  This new spec is much more 
 * complete than the RAML spec, which will be removed entirely in a 
 * subsequent commit. 
 
[e271092added6aa](https://github.com/tomakehurst/wiremock/commit/e271092added6aa) Mason Malone *2018-11-30 07:14:17*
 
**Remove RAML spec**
 
 * The RAML spec has been superseded by OpenAPI 3.0. While we could 
 * deprecate it and continue maintaining it until the next major version, 
 * it&#39;s unlikely anyone is relying on the RAML spec since it&#39;s of limited 
 * usefulness, and maintaining both specs would be time-consuming. 
 
[a8790edd9bd594a](https://github.com/tomakehurst/wiremock/commit/a8790edd9bd594a) Mason Malone *2018-11-30 07:14:17*
 
**Update to Swagger UI 3**
 
 * This updates Swagger UI to the latest version, since the current 
 * version doesn&#39;t support OpenAPI 3.0. Although I could&#39;ve extracted the 
 * new version in place, I figured it&#39;d be better to handle it in 
 * package.json by adding `swagger-ui-dist` as a dependency and copying it 
 * over the necessary files during build time. This will make upgrades 
 * easier in the future. 
 
[9e80ddbefa5ae9c](https://github.com/tomakehurst/wiremock/commit/9e80ddbefa5ae9c) Mason Malone *2018-11-30 05:35:26*
 
 
## 2.21.0
### No issue
 
**Re-worked to produce separate Java 7 and Java 8+ releases, with up to date dependencies for the latter**
 
 
[64012fccc130aa7](https://github.com/tomakehurst/wiremock/commit/64012fccc130aa7) Tom Akehurst *2019-01-29 19:32:00*
 
 
## 2.20.0
### GitHub [#1006](https://github.com/tomakehurst/wiremock/issues/1006) &quot;$schema&quot; refused in stubs definition    *Feature request*  
 
**Fixed #1006 - now ignores the presence of  at the root of a stub mapping JSON document, so that this can be used in (primarily) VS Code**
 
 
[674b3cbee2528c7](https://github.com/tomakehurst/wiremock/commit/674b3cbee2528c7) Tom Akehurst *2018-10-10 19:30:37*
 
 
### GitHub [#1007](https://github.com/tomakehurst/wiremock/issues/1007) Cannot use stubs for multipart requests with binary data with Spring Boot 2  
 
**Fixed #1007 - multipart request body parsing fails with Jetty 9.4+**
 
 
[b4a9a2f1b095c98](https://github.com/tomakehurst/wiremock/commit/b4a9a2f1b095c98) Tom Akehurst *2018-10-31 06:12:35*
 
 
### GitHub [#1019](https://github.com/tomakehurst/wiremock/issues/1019) Wrong/Corrupt files (FileSource) parameter in ResponseTransformer#transform method    *Maybe bug*  
 
**Fixed #1019 - files root incorrectly passed to response transformers**
 
 
[b8c89542c24dc9c](https://github.com/tomakehurst/wiremock/commit/b8c89542c24dc9c) Tom Akehurst *2018-10-31 17:54:47*
 
 
### GitHub [#1039](https://github.com/tomakehurst/wiremock/issues/1039) Unclear error message from ClasspathFileSource.getZipEntryUri  
 
**Informative error when ZipEntry not found #1039**
 
 
[744f381d86e86ef](https://github.com/tomakehurst/wiremock/commit/744f381d86e86ef) Tomas Bjerre *2018-11-22 18:13:44*
 
 
### GitHub [#459](https://github.com/tomakehurst/wiremock/issues/459) Combine default matchers with customMatcher    *Feature request*  
 
**Fixed #459 and #719 - added the ability to combine standard and custom matchers**
 
 
[75a053b6610509e](https://github.com/tomakehurst/wiremock/commit/75a053b6610509e) Tom Akehurst *2018-11-21 08:50:30*
 
 
### GitHub [#632](https://github.com/tomakehurst/wiremock/issues/632) equalToJson(..) with ignoreExtraElements = false should not accept empty arrays or empty objects    *Bug*  
 
**Fixed #632 - should not match empty objects or arrays in equal to json when ignoreExtraElements is false**
 
 
[e2b5763186a4e28](https://github.com/tomakehurst/wiremock/commit/e2b5763186a4e28) Tom Akehurst *2018-11-27 10:42:48*
 
 
### GitHub [#719](https://github.com/tomakehurst/wiremock/issues/719) Allow composition of custom matcher and WireMock&#39;s matchers    *Feature request*  
 
**Fixed #459 and #719 - added the ability to combine standard and custom matchers**
 
 
[75a053b6610509e](https://github.com/tomakehurst/wiremock/commit/75a053b6610509e) Tom Akehurst *2018-11-21 08:50:30*
 
 
### GitHub [#942](https://github.com/tomakehurst/wiremock/issues/942) When no proxy is configured, wiremock will not record    *Bug*  
 
**Added a doc note about allowNonProxied. See #942.**
 
 
[dec414502b1f2f5](https://github.com/tomakehurst/wiremock/commit/dec414502b1f2f5) Tom Akehurst *2018-09-20 16:55:43*
 
 
### GitHub [#954](https://github.com/tomakehurst/wiremock/issues/954) API documentation does not include global /reset command    *Bug*  
 
**Fixed #954 - missing /reset from API docs**
 
 
[80398a57e467135](https://github.com/tomakehurst/wiremock/commit/80398a57e467135) Tom Akehurst *2018-09-20 17:00:39*
 
 
### GitHub [#971](https://github.com/tomakehurst/wiremock/issues/971) Consider making Handlebars an optional dependency    *Feature request*  
 
**Minor amendments to the docs package.json. Upgraded to Handlebars 4.0.7 - fixes #971.**
 
 
[464ee3e2d9ea4f1](https://github.com/tomakehurst/wiremock/commit/464ee3e2d9ea4f1) Tom Akehurst *2018-09-20 15:50:25*
 
 
### No issue
 
**Bumped minor version**
 
 
[b28b306aa7dfcec](https://github.com/tomakehurst/wiremock/commit/b28b306aa7dfcec) Tom Akehurst *2018-12-22 16:44:03*
 
**Excluded an unneeded transient dependency. Shaded a Google dependency.**
 
 
[7fd45b0de7d4bda](https://github.com/tomakehurst/wiremock/commit/7fd45b0de7d4bda) Tom Akehurst *2018-11-05 21:05:50*
 
**[fix_typos_in_request_matching] Fix docs typos**
 
 * Fix two typos in request-matching documenation 
 
[a06e4a1d6c700bc](https://github.com/tomakehurst/wiremock/commit/a06e4a1d6c700bc) Dan Kolb *2018-11-05 21:05:36*
 
**Set the async timeout to 5 minutes to avoid breaking stubs with longer delays (default was 30s)**
 
 
[72ea24aa1e4bd48](https://github.com/tomakehurst/wiremock/commit/72ea24aa1e4bd48) Tom Akehurst *2018-11-05 19:26:51*
 
**docs: remove redundant semicolon in code example**
 
 
[b7593bf408fc5f2](https://github.com/tomakehurst/wiremock/commit/b7593bf408fc5f2) tbcs *2018-11-05 18:48:11*
 
**Modified URL to name conversion logic used in filename and recorded scenario name generation to use an unlimited number of path nodes, to avoid scenario name duplicates with complex URL structures. Adjusted filename generation logic to truncate names with URL parts longer than 150 chars.**
 
 
[1fea7878d19a79f](https://github.com/tomakehurst/wiremock/commit/1fea7878d19a79f) Tom Akehurst *2018-11-01 09:17:42*
 
**Resolve scenario name conflict restricting to two node parts**
 
 
[14db079e673e3a5](https://github.com/tomakehurst/wiremock/commit/14db079e673e3a5) Abinaya Veluswamy *2018-11-01 06:31:38*
 
**Extended a test delay to improve CI stability**
 
 
[865c32d043dc44b](https://github.com/tomakehurst/wiremock/commit/865c32d043dc44b) Tom Akehurst *2018-10-31 07:46:50*
 
**Attempt at fixing race condition in PostServeActionExtensionTest**
 
 
[b79e7f67d27988a](https://github.com/tomakehurst/wiremock/commit/b79e7f67d27988a) Tom Akehurst *2018-10-31 06:45:46*
 
**Extended timeout in PostServeActionExtensionsTest in order to improve CI stability**
 
 
[64f7f786aee499b](https://github.com/tomakehurst/wiremock/commit/64f7f786aee499b) Tom Akehurst *2018-10-31 06:14:21*
 
**refine test with jMock**
 
 
[47ce27105ac2d27](https://github.com/tomakehurst/wiremock/commit/47ce27105ac2d27) Zheng Wang *2018-10-29 15:08:57*
 
**remove redundant println in test**
 
 
[82acb55af6ba825](https://github.com/tomakehurst/wiremock/commit/82acb55af6ba825) Zheng Wang *2018-10-26 15:08:52*
 
**Add unit test for admin request log change**
 
 
[5ddff2c2b53b7fe](https://github.com/tomakehurst/wiremock/commit/5ddff2c2b53b7fe) Zheng Wang *2018-10-26 15:07:25*
 
**Add more info to admin request log**
 
 
[5d2e6cbff50e716](https://github.com/tomakehurst/wiremock/commit/5d2e6cbff50e716) Zheng Wang *2018-10-24 14:12:03*
 
**Revert "Updated Travis config with JDK 10 builds" until test failures can be resolved**
 
 * This reverts commit e53d85d3c1cdaa90f33664a8d919e6bc02afc7a9. 
 
[231c2cc286456ae](https://github.com/tomakehurst/wiremock/commit/231c2cc286456ae) Tom Akehurst *2018-10-12 09:29:19*
 
**Updated Travis config with JDK 10 builds**
 
 
[e53d85d3c1cdaa9](https://github.com/tomakehurst/wiremock/commit/e53d85d3c1cdaa9) Tom Akehurst *2018-10-12 09:06:09*
 
**Updated docs ruby and node dependencies and fixed a resulting SCSS problem**
 
 
[a412bdc673a7bc2](https://github.com/tomakehurst/wiremock/commit/a412bdc673a7bc2) Tom Akehurst *2018-10-10 19:27:10*
 
**Cleaned up some imports**
 
 
[1a74e81dd897476](https://github.com/tomakehurst/wiremock/commit/1a74e81dd897476) Tom Akehurst *2018-10-10 19:26:10*
 
**Update README.md**
 
 * Small typo corrected in Questions and Issues 
 
[88c9edb2ebc5a2c](https://github.com/tomakehurst/wiremock/commit/88c9edb2ebc5a2c) Shey *2018-10-10 00:52:15*
 
**Add ConditionalHelpers support**
 
 
[10b9b7637078552](https://github.com/tomakehurst/wiremock/commit/10b9b7637078552) elfogre *2018-10-04 16:12:33*
 
**- Updated gradle wrapper to latest version**
 
 * - updated node-sass to latest version so it plays nice with MacOS 
 
[75d65a36423de45](https://github.com/tomakehurst/wiremock/commit/75d65a36423de45) Per Abich *2018-10-03 12:10:52*
 
**Updating package-lock**
 
 
[9abe490674022cd](https://github.com/tomakehurst/wiremock/commit/9abe490674022cd) Tom Akehurst *2018-09-20 17:33:40*
 
**Documented body file templating**
 
 
[5e3c1ed741996be](https://github.com/tomakehurst/wiremock/commit/5e3c1ed741996be) Tom Akehurst *2018-09-20 17:20:50*
 
**Added a doc comment indicating the body file paths must be relative**
 
 
[95a57b0721f5eea](https://github.com/tomakehurst/wiremock/commit/95a57b0721f5eea) Tom Akehurst *2018-09-20 17:08:55*
 
**Implemented recording of multipart requests and fixed an incorrect import in MockRequestBuilder**
 
 
[8cf81ab0e15464b](https://github.com/tomakehurst/wiremock/commit/8cf81ab0e15464b) Viktor Polishchuk *2018-09-19 13:15:22*
 
**Fixed JSON name for mappings in Scenario**
 
 
[d14fed9da110b1a](https://github.com/tomakehurst/wiremock/commit/d14fed9da110b1a) Tom Akehurst *2018-09-18 18:36:06*
 
**Fix broken UT**
 
 
[f56badb9bde30e1](https://github.com/tomakehurst/wiremock/commit/f56badb9bde30e1) Kevin Rigot *2018-04-22 18:05:31*
 
**remove username and password since should be put in url**
 
 
[e41faa9f38fecf9](https://github.com/tomakehurst/wiremock/commit/e41faa9f38fecf9) Kevin Rigot *2018-04-22 17:53:35*
 
**ProxyVia url parsing refactored**
 
 
[0cce20c610f680a](https://github.com/tomakehurst/wiremock/commit/0cce20c610f680a) Kevin Rigot *2018-04-21 10:10:57*
 
**Add user authentication for proxy via**
 
 
[1e83f9c225becf7](https://github.com/tomakehurst/wiremock/commit/1e83f9c225becf7) Kevin Rigot *2018-04-21 07:34:11*
 
**add maven central batch to show latest version**
 
 
[4a0f6cb50769018](https://github.com/tomakehurst/wiremock/commit/4a0f6cb50769018) Jan-Hendrik Peters *2016-12-19 13:04:17*
 
**Added resetAll() calls to NearMissesRuleAcceptanceTest setup methods to avoid test order dependencies**
 
 
[1cece0af9df084a](https://github.com/tomakehurst/wiremock/commit/1cece0af9df084a) Tom Akehurst *2016-12-08 09:44:59*
 
**Bumped docs version to 2.5.0**
 
 
[3590b97c7e50ddd](https://github.com/tomakehurst/wiremock/commit/3590b97c7e50ddd) Tom Akehurst *2016-12-06 18:04:36*
 
**documented WiremockNetworkTrafficListener usage**
 
 
[fdae5efdeb86df5](https://github.com/tomakehurst/wiremock/commit/fdae5efdeb86df5) Wojciech Bulaty *2016-12-06 17:38:52*
 
**added --print-all-network-traffic to documentation**
 
 
[f2212790cb9abd7](https://github.com/tomakehurst/wiremock/commit/f2212790cb9abd7) Wojciech Bulaty *2016-12-06 17:09:00*
 
**Added ConsoleNotifyingWiremockNetworkTrafficListener and exposed it in CommandLineOptions**
 
 
[735a07400c179ba](https://github.com/tomakehurst/wiremock/commit/735a07400c179ba) Wojciech Bulaty *2016-12-03 21:51:41*
 
**In order to be able to see raw traffic from and to Wiremock for debugging purposes in acceptance tests I have added a NetworkTrafficListener to the ServerConnector and exposed it via an interface WiremockNetworkTrafficListener. The root cause of this was that com.github.tomakehurst.wiremock.http.RequestListener will not record things Jetty does to the request, for example appending "--gzip" to an E-TAG header if the content is gzipped, see org.eclipse.jetty.servlets.gzip.AbstractCompressedStream line 26:  setHeader("ETag",etag.substring(0,end)+"--"+_encoding+'"').**
 
 
[7773ec542e9533d](https://github.com/tomakehurst/wiremock/commit/7773ec542e9533d) Wojciech Bulaty *2016-10-12 16:27:56*
 
**Moved logging of requests to before the response is committed as this causes a loss of synchronisation at the client if done afterwards.**
 
 
[8c441f36d190b4a](https://github.com/tomakehurst/wiremock/commit/8c441f36d190b4a) Tom Akehurst *2016-10-04 22:06:24*
 
 
## 2.19.0
### Jira issue-965   
 
**issue-965 - fix issue with swagger-ui and https**
 
 
[963471c02269299](https://github.com/tomakehurst/wiremock/commit/963471c02269299) Mark Lambert *2018-08-21 17:30:08*
 
 
### No issue
 
**Bumped minor version**
 
 
[0ac2e54562fcd2e](https://github.com/tomakehurst/wiremock/commit/0ac2e54562fcd2e) Tom Akehurst *2018-09-18 16:31:05*
 
**Removed redundant method**
 
 
[b34eaaa2b4d76bc](https://github.com/tomakehurst/wiremock/commit/b34eaaa2b4d76bc) Tom Akehurst *2018-09-18 16:29:24*
 
**Fixed scenario bug where possible states could be removed even when stubs referring to them still exist**
 
 
[2946450d194e4a7](https://github.com/tomakehurst/wiremock/commit/2946450d194e4a7) Tom Akehurst *2018-09-18 16:18:49*
 
**Switched to a more efficient and slightly less leaky scenarios implementation**
 
 
[535a20d0db1359a](https://github.com/tomakehurst/wiremock/commit/535a20d0db1359a) Tom Akehurst *2018-09-18 14:18:12*
 
**Removed redundant comment**
 
 
[6bfdf1ae24ea307](https://github.com/tomakehurst/wiremock/commit/6bfdf1ae24ea307) Tom Akehurst *2018-09-17 18:31:55*
 
**Added debug response headers Matched-Stub-Id and Matched-Stub-Name**
 
 
[b84568b4b68bdba](https://github.com/tomakehurst/wiremock/commit/b84568b4b68bdba) Tom Akehurst *2018-09-17 18:26:01*
 
**Refactored renderers to take a ServeEvent, rather than ResponseDefinition, making stub name and ID accessible**
 
 
[f6184d79876ab99](https://github.com/tomakehurst/wiremock/commit/f6184d79876ab99) Tom Akehurst *2018-09-17 17:25:48*
 
**Added timing data to serve events**
 
 
[d0440f47bbf5b8d](https://github.com/tomakehurst/wiremock/commit/d0440f47bbf5b8d) Tom Akehurst *2018-09-08 14:09:44*
 
**docs(README): Fix maven-central badge**
 
 * The current badge link `https://maven-badges.herokuapp.com/maven-central/com.github.tomakehurst/wiremock` is redirecting to `https://search.maven.org`. 
 
[087f69c55f7bb26](https://github.com/tomakehurst/wiremock/commit/087f69c55f7bb26) Anish Karandikar *2018-09-07 14:09:26*
 
**remove extra lines**
 
 
[76007040eea231e](https://github.com/tomakehurst/wiremock/commit/76007040eea231e) wieczorekm *2018-08-24 04:59:48*
 
**add base url method to wiremock server**
 
 
[ae9f182f65078bf](https://github.com/tomakehurst/wiremock/commit/ae9f182f65078bf) wieczorekm *2018-08-24 04:51:37*
 
 
## 2.18.0
### GitHub [#581](https://github.com/tomakehurst/wiremock/issues/581) Documentation does not describe that you can delete requests ?    *Feature request*  
 
**Suggested API doc change to fix #581**
 
 
[9dcbfd02bcca057](https://github.com/tomakehurst/wiremock/commit/9dcbfd02bcca057) Jon Hinks *2017-04-10 10:11:47*
 
 
### GitHub [#628](https://github.com/tomakehurst/wiremock/pull/628) Add default request config check stale conn  
 
**Add default request config check stale conn (#628)**
 
 * added test for couchbase 
 * Now we check for stale connections and don&#39;t try to reuse them 
 * fix test 
 * Removed inconvenient Couchbase test 
 
[cc73efbef41e66b](https://github.com/tomakehurst/wiremock/commit/cc73efbef41e66b) Joe Klauza *2017-04-09 11:28:32*
 
 
### GitHub [#674](https://github.com/tomakehurst/wiremock/pull/674) Issue #546 - New API endpoint for recording stub mappings  
 
**Refactoring to extract URL path logic to a method**
 
 * This extracts some logic in UniqueFilenameGenerator for turning URL 
 * paths into a hyphen-delimited string over to a method in Urls. This 
 * makes it easier to test and will be necessary for PR #674, since it also 
 * uses this logic. 
 
[5192a752fbcdce2](https://github.com/tomakehurst/wiremock/commit/5192a752fbcdce2) Mason Malone *2017-07-10 06:07:27*
 
 
### GitHub [#717](https://github.com/tomakehurst/wiremock/issues/717) Allow access to the host/port in response template    *Feature request*  
 
**Add absolute url in the RequestTemplateModel tomakehurst/wiremock#717**
 
 
[44d68e71470fa52](https://github.com/tomakehurst/wiremock/commit/44d68e71470fa52) Samuel Soubeyran *2017-07-14 22:19:13*
 
 
### GitHub [#880](https://github.com/tomakehurst/wiremock/issues/880) TransformerParamerters are ignored  
 
**Fixed #880 - place transformerParameters under a top-level key called parameters**
 
 
[d3e63a57b4b5106](https://github.com/tomakehurst/wiremock/commit/d3e63a57b4b5106) Babur *2018-02-20 13:26:29*
 
**Fixed #880 - transformerParameters are applied to template**
 
 
[7b9e61edf629d4c](https://github.com/tomakehurst/wiremock/commit/7b9e61edf629d4c) Babur *2018-02-20 12:30:16*
 
 
### GitHub [#934](https://github.com/tomakehurst/wiremock/issues/934) EqualToXmlPattern considers non-equal XMLs as exactly equal    *Bug*  
 
**Fixed #934 - EqualToXmlPattern was returning an exact match when element names differed**
 
 
[2e28bac2a8303ac](https://github.com/tomakehurst/wiremock/commit/2e28bac2a8303ac) Tom Akehurst *2018-05-08 19:59:27*
 
 
### Jira UTF-8   
 
**Fix binary body corruption for logged response**
 
 * While working on the snapshot feature, I discovered that binary response 
 * bodies were getting corrupted. This is happening because the 
 * LoggedResponse.from() method sets the body by calling 
 * Response.getBodyAsString(), which encodes the body in the charset for 
 * the content type header (or UTF-8, if that&#39;s absent). Any invalid 
 * characters in the string get silently replaced with the default 
 * replacement character (U+FFFD for Unicode). 
 * I fixed this by just copying what LoggedRequest is doing: instantiate 
 * the body using a Base64-encoded string and have a &quot;getBodyAsString()&quot; 
 * method that does necessary encoding. 
 * I moved the Response.encodingFromContentTypeHeaderOrUtf8() method to 
 * ContentTypeHeader.encodingOrUtf8() so both Response and LoggedResponse 
 * could use it. 
 
[b3addc3605f2213](https://github.com/tomakehurst/wiremock/commit/b3addc3605f2213) Mason Malone *2017-07-05 06:23:17*
 
 
### Jira standalone-2   
 
**Updated standalone.jar's name**
 
 * Since version 2 the name pattern of the standalone jar seems to have changed to e.g. &quot;wiremock-standalone-2.6.0.jar&quot; 
 
[c0c5aa0b2fdb9c9](https://github.com/tomakehurst/wiremock/commit/c0c5aa0b2fdb9c9) Peter Wippermann *2017-04-19 09:33:26*
 
 
### No issue
 
**Updated RAML spec to document allowNonProxied flag in record spec**
 
 
[fd9f71cf7a729f5](https://github.com/tomakehurst/wiremock/commit/fd9f71cf7a729f5) Tom Akehurst *2018-05-28 18:40:24*
 
**Updated RAML to include metadata field on stub mapping**
 
 
[a6fbe1206d85855](https://github.com/tomakehurst/wiremock/commit/a6fbe1206d85855) Tom Akehurst *2018-05-28 18:24:42*
 
**Added RAML definitions for the new find and remove by metadata API endpoints**
 
 
[63f495e84e52dd9](https://github.com/tomakehurst/wiremock/commit/63f495e84e52dd9) Tom Akehurst *2018-05-28 18:21:59*
 
**Excluded the now helper from StringHelpers in Handlebars and aliased the WireMock now helper to date, with docs indicating that date is the form to use when passing a date**
 
 
[40a6c4623388f68](https://github.com/tomakehurst/wiremock/commit/40a6c4623388f68) Tom Akehurst *2018-05-28 17:18:35*
 
**Bumped minor version**
 
 
[3f7b85ac5cb7be3](https://github.com/tomakehurst/wiremock/commit/3f7b85ac5cb7be3) Tom Akehurst *2018-05-25 13:39:27*
 
**Select the Jetty GZip wrapper class dynamically so that it works with Jetty 9.2 and 9.4**
 
 
[092bb15f4926d39](https://github.com/tomakehurst/wiremock/commit/092bb15f4926d39) Tom Akehurst *2018-05-25 13:38:52*
 
**Added a doc page for stub metadata**
 
 
[52564c0de11f614](https://github.com/tomakehurst/wiremock/commit/52564c0de11f614) Tom Akehurst *2018-05-17 14:02:12*
 
**Added a performance test sub-project**
 
 
[de922f85ff8511b](https://github.com/tomakehurst/wiremock/commit/de922f85ff8511b) Tom Akehurst *2018-05-16 21:31:48*
 
**Added docs for additional response template model URL elements and new date functions/parameters**
 
 
[4f7d3416fc775ac](https://github.com/tomakehurst/wiremock/commit/4f7d3416fc775ac) Tom Akehurst *2018-05-16 17:49:54*
 
**Added 'allowNonProxied' filter parameter to record spec, to enable "teaching" via non-matched, non-proxied requests**
 
 
[8c30eaf6e48b255](https://github.com/tomakehurst/wiremock/commit/8c30eaf6e48b255) Tom Akehurst *2018-05-15 09:56:20*
 
**Added ability to attach arbitrary JSON metadata to stubs, and to find and delete stubs based on metadata content**
 
 
[087fefad1234a2f](https://github.com/tomakehurst/wiremock/commit/087fefad1234a2f) Tom Akehurst *2018-05-15 09:09:21*
 
**Added support for adjusting to timezones in the date Handlebars helper**
 
 
[f52855a33dc64e5](https://github.com/tomakehurst/wiremock/commit/f52855a33dc64e5) Tom Akehurst *2018-05-15 06:24:12*
 
**Renamed now helper to date to avoid clashing with the existing StringHelpers.now. Added a parseDate Handlebars helper.**
 
 
[393c1f866598fc0](https://github.com/tomakehurst/wiremock/commit/393c1f866598fc0) Tom Akehurst *2018-05-10 08:23:21*
 
**Added baseUrl to the requestLine template model**
 
 
[907c7d561303c75](https://github.com/tomakehurst/wiremock/commit/907c7d561303c75) Tom Akehurst *2018-04-26 15:30:54*
 
**optimized imports**
 
 
[d3f53f4542f27ae](https://github.com/tomakehurst/wiremock/commit/d3f53f4542f27ae) marcodave *2018-04-23 08:42:40*
 
**SSL truststore tries to load from classpath**
 
 
[de10bb7b56835a0](https://github.com/tomakehurst/wiremock/commit/de10bb7b56835a0) marcodave *2018-04-23 08:36:40*
 
**Fixes for OpenAPI 3.0 compatibility**
 
 * This makes a couple minor backwards-compatible fixes for OpenAPI 3.0 
 * compatibility: 
 * 1. Remove the &quot;id&quot; properties in scenario.schema.json, which aren&#39;t 
 * present in any of the other schema files, and cause validation errors. 
 * 2. Define the baseUri to be &quot;/__admin&quot;. Besides simplifying all the 
 * other URLs, this gets translated to the server object URL by 
 * api-spec-converter, which is required in OpenAPI 3.0: 
 * https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.0.md#serverObject 
 
[f69f53764158ac2](https://github.com/tomakehurst/wiremock/commit/f69f53764158ac2) Mason Malone *2018-04-22 04:29:53*
 
**Add API schema for /__admin/near-misses/request**
 
 
[c49acf25556b3e6](https://github.com/tomakehurst/wiremock/commit/c49acf25556b3e6) Mason Malone *2018-04-22 04:20:04*
 
**Add API schema for /_admin/settings**
 
 * This adds an API schema for the /__admin/settings endpoint, and splits 
 * off the delay distribution schema into a separate file, since it&#39;s now 
 * referenced by both the new schema and response-definition.schema.json. 
 
[c8c9e1c97a82bdd](https://github.com/tomakehurst/wiremock/commit/c8c9e1c97a82bdd) Mason Malone *2018-04-22 04:15:24*
 
**Add proper API specs for recordings API endpoints**
 
 * Both /__admin/recordings/start and /__admin/recordings/snapshot were 
 * using the same API spec (record-spec.schema.json), but they take different 
 * parameters. This changes record-spec.schema.json to only contain the 
 * common parameters, and adds separate schemas that extend it with the 
 * endpoint-specific parameters. 
 
[979a2060aa6b62b](https://github.com/tomakehurst/wiremock/commit/979a2060aa6b62b) Mason Malone *2018-04-22 04:13:51*
 
**Fix typos in documentation and API specs**
 
 * This fixes a few mistakes in the docs and API specs: 
 * 1. The recording API takes a &#39;persist&#39; parameter, not &#39;persistent&#39; 
 * 2. The stub-mapping.schema.json spec used &#39;descrption&#39; instead of &#39;description&#39; 
 * 3. The scenario.schema.json spec used &#39;examples&#39; instead of &#39;example&#39;. 
 * While &#39;examples&#39; is valid JSON Schema, everything else uses &#39;example&#39;, 
 * and this is what api-spec-converter looks for. 
 
[35bf439f21c4db7](https://github.com/tomakehurst/wiremock/commit/35bf439f21c4db7) Mason Malone *2018-04-22 03:48:49*
 
**Switched to new Jetty GZip implementation**
 
 
[b540c0f8b4351f4](https://github.com/tomakehurst/wiremock/commit/b540c0f8b4351f4) Tom Akehurst *2018-04-18 17:25:25*
 
**Added unix epoch time as an available date format in the handlebars helper**
 
 
[b1f93f1c9334980](https://github.com/tomakehurst/wiremock/commit/b1f93f1c9334980) Tom Akehurst *2018-04-18 17:18:34*
 
**Randomised ports in test cases defaulting to 8080**
 
 
[c755fdc7479b441](https://github.com/tomakehurst/wiremock/commit/c755fdc7479b441) Tom Akehurst *2018-02-23 19:18:13*
 
**Now prevents reading and writing files via a SingleRootFileSource (or any that extends AbstractFileSource) that are not under the root**
 
 
[831aec84b553fa1](https://github.com/tomakehurst/wiremock/commit/831aec84b553fa1) Tom Akehurst *2018-02-23 19:18:13*
 
**Create a RequestLine model nested in the RequestTemplateModel to hold the data concerning the "Request Line" in the HTTP protocol. The data is the scheme, the host, the port, the path and the query. Extended the RequestTemplateModel to make the RequestLine object accessible. Keeping the behavior of the RequestTemplateModel backward compatible by delegating some calls to the nested RequestLine object. Extend the Request interface to get access to scheme, host and port while keeping it backward compatible.**
 
 
[716fc10232f08e6](https://github.com/tomakehurst/wiremock/commit/716fc10232f08e6) Samuel Soubeyran *2017-07-27 01:46:21*
 
**Upgraded to commons-lang 3.6**
 
 
[ce74c429bd15544](https://github.com/tomakehurst/wiremock/commit/ce74c429bd15544) Tom Akehurst *2017-07-10 16:03:41*
 
**Upgraded to jopt-simple 5.0.3**
 
 
[2731aaefead8437](https://github.com/tomakehurst/wiremock/commit/2731aaefead8437) Tom Akehurst *2017-07-10 16:00:32*
 
**Upgraded to JSONPath 2.4.0**
 
 
[881a3542dcda784](https://github.com/tomakehurst/wiremock/commit/881a3542dcda784) Tom Akehurst *2017-07-10 15:59:09*
 
**Factored out a variable for xmlunit version in the build**
 
 
[317023a7eab2858](https://github.com/tomakehurst/wiremock/commit/317023a7eab2858) Tom Akehurst *2017-07-10 15:57:57*
 
**Upgraded to httpclient 4.5.3**
 
 
[e8e96f6fb0ef673](https://github.com/tomakehurst/wiremock/commit/e8e96f6fb0ef673) Tom Akehurst *2017-07-10 15:56:49*
 
**Upgraded to Guava 20.0**
 
 
[e4db43863bc951b](https://github.com/tomakehurst/wiremock/commit/e4db43863bc951b) Tom Akehurst *2017-07-10 15:54:48*
 
**Upgraded to Jetty 9.2.22.v20170606**
 
 
[1a0933e319ba7b9](https://github.com/tomakehurst/wiremock/commit/1a0933e319ba7b9) Tom Akehurst *2017-07-10 15:51:11*
 
**Upgraded to Jackson 2.8.9**
 
 
[097740ec0edef9e](https://github.com/tomakehurst/wiremock/commit/097740ec0edef9e) Tom Akehurst *2017-07-10 15:50:02*
 
**Refactoring to consolidate charset logic into Strings**
 
 
[778781ba4278e63](https://github.com/tomakehurst/wiremock/commit/778781ba4278e63) Mason Malone *2017-07-06 08:05:01*
 
**[Bala] Documentation typos & formatting**
 
 
[5350879c1df321b](https://github.com/tomakehurst/wiremock/commit/5350879c1df321b) Balajee Mohan *2017-07-01 01:36:02*
 
**Add getOptions() to Admin interface**
 
 * For the new recording API endpoint, we&#39;ll want to be able to extract response 
 * bodies to a file and load stub mapping transformer extensions. This means 
 * having access to `Options.filesSource()` so it can write out the extracted 
 * bodies, and `Options.extensionsOfType()` for loading the transformer 
 * extensions. 
 * I&#39;m not sure if `WireMockServer.getOptions()` and `WireMockApp.getOptions()` 
 * are really worth testing, since they&#39;re simple getters. I wrote a test for 
 * former since there&#39;s already a test class for it. 
 
[b6537650067e652](https://github.com/tomakehurst/wiremock/commit/b6537650067e652) Mason Malone *2017-06-08 07:04:17*
 
**Publish testJar to Maven Central**
 
 * When writing tests for extensions, the test classes in 
 * com.github.tomakehurst.wiremock.matching and 
 * com.github.tomakehurst.wiremock.matching are very helpful. Since it&#39;s 
 * not possible to include those as Maven Central dependencies, I had 
 * to add wiremock as a Git submodule in my wiremock-snapshot extension 
 * so I could use them. Another extension, wiremock-velocity-transformer, 
 * seems to have had the same issue and just did a straight copy of the 
 * test sources. 
 
[d8b120b8fd8d88e](https://github.com/tomakehurst/wiremock/commit/d8b120b8fd8d88e) Mason Malone *2017-06-04 08:03:04*
 
**Enabled query parameters to be logged in request log separately from the URL**
 
 
[e0c4c46fa75d4e7](https://github.com/tomakehurst/wiremock/commit/e0c4c46fa75d4e7) Jarkko Kallio *2017-05-07 18:09:40*
 
**added proxy settings to connect to remote wiremock server over a http proxy**
 
 * e.g. 
 * WireMock instance = new WireMock(&quot;https&quot;, &quot;wiremock.server.url&quot;, 443, null, &quot;&quot; &quot;proxyhost&quot;, proxyport); 
 * See WireMockClientWithProxyAcceptanceTest 
 
[42b5d1f053523b1](https://github.com/tomakehurst/wiremock/commit/42b5d1f053523b1) eelco *2017-04-11 09:21:36*
 
**added proxy settings to connect to remote wiremock server over a http proxy**
 
 * e.g. 
 * WireMock instance = new WireMock(&quot;https&quot;, &quot;wiremock.server.url&quot;, 443, null, &quot;&quot; &quot;proxyhost&quot;, proxyport); 
 
[6bbc97e8af82ae8](https://github.com/tomakehurst/wiremock/commit/6bbc97e8af82ae8) eelco *2017-03-28 12:53:53*
 
**Add additional information about file serving to the documentation**
 
 
[11f169aff2f347d](https://github.com/tomakehurst/wiremock/commit/11f169aff2f347d) Dani Rey *2017-01-07 12:58:37*
 
**Added note about using standalone JAR with Spring Boot**
 
 
[ed43ebc4e7c19d2](https://github.com/tomakehurst/wiremock/commit/ed43ebc4e7c19d2) Tom Akehurst *2017-01-06 18:35:56*
 
 
## 2.17.0
### GitHub [#915](https://github.com/tomakehurst/wiremock/issues/915) EqualToXmlPattern#getExpected need to catch prettyPrint exceptions    *Maybe bug*  
 
**Fix #915 - Avoid trying to set indent-number on XML TransformerFactory unless we know it is the Java version (and not e.g. Saxon)**
 
 
[c4b388ce7b94c4d](https://github.com/tomakehurst/wiremock/commit/c4b388ce7b94c4d) Tom Akehurst *2018-04-16 10:27:08*
 
 
### Jira HTTPCLIENT-1836   
 
**Update httpclient to fix hostname verification**
 
 * On some cases it&#39;s not possible to record using HTTPS, because of BUG 
 * in httpclient, see https://issues.apache.org/jira/browse/HTTPCLIENT-1836 
 
[e85d3f95f38ddb9](https://github.com/tomakehurst/wiremock/commit/e85d3f95f38ddb9) Jiří Mikulášek *2018-04-11 12:14:54*
 
 
### No issue
 
**Added docs for new handlebars helpers**
 
 
[8e70abf0a636ee6](https://github.com/tomakehurst/wiremock/commit/8e70abf0a636ee6) Tom Akehurst *2018-04-16 17:56:32*
 
**Upgraded to Jetty 9.2.24.v20180105**
 
 
[d6ffe4bd5eb424e](https://github.com/tomakehurst/wiremock/commit/d6ffe4bd5eb424e) Tom Akehurst *2018-04-16 17:00:28*
 
**Upgraded to commons-lang 3.7**
 
 
[56383a49c75cfb8](https://github.com/tomakehurst/wiremock/commit/56383a49c75cfb8) Tom Akehurst *2018-04-16 16:54:00*
 
**Upgraded to XMLUnit 2.5.1**
 
 
[5c296c8c496192c](https://github.com/tomakehurst/wiremock/commit/5c296c8c496192c) Tom Akehurst *2018-04-16 16:52:33*
 
**Upgraded to zjsonpatch 0.4.4**
 
 
[56504161d14a9da](https://github.com/tomakehurst/wiremock/commit/56504161d14a9da) Tom Akehurst *2018-04-16 16:36:28*
 
**Upgraded to Jackson 2.8.11 (2.9.x not easily doable due to removal of support for @JsonUnwrapped in constructors)**
 
 
[675775494f6d036](https://github.com/tomakehurst/wiremock/commit/675775494f6d036) Tom Akehurst *2018-04-16 16:06:49*
 
**Added Handlebars helper for rendering the current date, optionally with an offset**
 
 
[646f85df7aec013](https://github.com/tomakehurst/wiremock/commit/646f85df7aec013) Tom Akehurst *2018-04-16 13:17:22*
 
**Added a random values template helper. Added the Handlebars assign and number helpers.**
 
 
[0830021377e3ecb](https://github.com/tomakehurst/wiremock/commit/0830021377e3ecb) Tom Akehurst *2018-04-16 11:47:11*
 
**Added additional constructor to LoggedResponse, avoiding the need to encode then re-decode the body as base64 (and avoiding the associated performance penalty)**
 
 
[f12a4a4110e98e1](https://github.com/tomakehurst/wiremock/commit/f12a4a4110e98e1) Tom Akehurst *2018-04-16 10:30:26*
 
**Bumped minor version**
 
 
[034fe811bf73607](https://github.com/tomakehurst/wiremock/commit/034fe811bf73607) Tom Akehurst *2018-04-16 09:35:19*
 
 
## 2.16.0
### GitHub [#898](https://github.com/tomakehurst/wiremock/issues/898) Dynamic port when running via .jar    *Feature request*  
 
**#898 Show the resulting port number instead of 0**
 
 
[6f3f1ec32b7dd38](https://github.com/tomakehurst/wiremock/commit/6f3f1ec32b7dd38) Nico Schoenmaker *2018-03-08 11:39:31*
 
 
### GitHub [#909](https://github.com/tomakehurst/wiremock/issues/909) Jetty bug throwing 500s:  java.io.IOException: Missing content for multipart request  
 
**Fixed #909 - 500 error when using multipart matchers and an empty multipart body is sent**
 
 
[f006fed840eabf1](https://github.com/tomakehurst/wiremock/commit/f006fed840eabf1) Tom Akehurst *2018-03-28 10:45:26*
 
 
### No issue
 
**Bumped minor version**
 
 
[1329fba17238c84](https://github.com/tomakehurst/wiremock/commit/1329fba17238c84) Tom Akehurst *2018-03-28 11:53:58*
 
**Performance improvement - avoid encoding/decoding base64 request body every time a LoggedRequest is constructed**
 
 
[5f487bdbd1324fd](https://github.com/tomakehurst/wiremock/commit/5f487bdbd1324fd) Tom Akehurst *2018-03-28 11:51:11*
 
**Added missing copyright headers**
 
 
[9818561d9ed3c1a](https://github.com/tomakehurst/wiremock/commit/9818561d9ed3c1a) Tom Akehurst *2018-03-28 10:12:23*
 
**Refactored async response executor setup so that it happens outside the servlet and is injected, rather than the servlet constructing the scheduler**
 
 
[b91514902df7b24](https://github.com/tomakehurst/wiremock/commit/b91514902df7b24) Tom Akehurst *2018-03-27 16:14:01*
 
**Tweaks to body file streaming - BinaryFile is now an InputStreamSource. This allows construction of the stream to be abstracted behind FileSource, allowing e.g. S3 file sources in future.**
 
 
[e63d62b6c363477](https://github.com/tomakehurst/wiremock/commit/e63d62b6c363477) Tom Akehurst *2018-03-27 15:31:37*
 
**Deleted commented-out code**
 
 
[a318144cca84f62](https://github.com/tomakehurst/wiremock/commit/a318144cca84f62) Tom Akehurst *2018-03-27 15:09:24*
 
**Added some extra tests around XML handling**
 
 
[d36516bb76b3b7b](https://github.com/tomakehurst/wiremock/commit/d36516bb76b3b7b) Tom Akehurst *2018-03-23 12:33:17*
 
**Cleaned up some imports**
 
 
[ea18dab0082b858](https://github.com/tomakehurst/wiremock/commit/ea18dab0082b858) Tom Akehurst *2018-03-23 12:27:46*
 
**Disabled downloading of externally referenced DTDs during XML parsing and XPath evaluation**
 
 
[4c6dfde82a5ee91](https://github.com/tomakehurst/wiremock/commit/4c6dfde82a5ee91) Tom Akehurst *2018-03-23 12:26:02*
 
**Add disable-banner option**
 
 
[aec7a10712b728b](https://github.com/tomakehurst/wiremock/commit/aec7a10712b728b) Jim Ma *2018-03-21 08:15:13*
 
**Added multiple query parameters stubbing capability**
 
 
[efc6b7a8914046d](https://github.com/tomakehurst/wiremock/commit/efc6b7a8914046d) Bryant Baird *2018-03-06 21:43:22*
 
**Added test cases for withQueryParameters function**
 
 
[ed679ecb38691d2](https://github.com/tomakehurst/wiremock/commit/ed679ecb38691d2) Bryant Baird *2018-03-06 21:43:22*
 
**Use a InheritableThreadLocal for WireMock so that new threads are created with existing WireMock configuration**
 
 
[6045de537c7dbc7](https://github.com/tomakehurst/wiremock/commit/6045de537c7dbc7) Jason Leezer *2018-03-05 19:44:07*
 
**Added a GitHub issue teplate**
 
 
[3c635706bbe7945](https://github.com/tomakehurst/wiremock/commit/3c635706bbe7945) Tom Akehurst *2018-03-02 12:42:00*
 
**Added a note to the Jetty version in the build to deter PRs upgrading it**
 
 
[4368d316ec239ba](https://github.com/tomakehurst/wiremock/commit/4368d316ec239ba) Tom Akehurst *2018-02-25 19:04:57*
 
**Update gradle 4.5.1 and parallelize builds**
 
 
[52975f6cf9ad990](https://github.com/tomakehurst/wiremock/commit/52975f6cf9ad990) Arjan Duijzer *2018-02-25 18:50:59*
 
**Using streams for building responses.**
 
 
[09543051c0176ff](https://github.com/tomakehurst/wiremock/commit/09543051c0176ff) Dan Ebert *2018-02-23 18:43:17*
 
**Fix grammatical issue**
 
 
[533b248eaeb4133](https://github.com/tomakehurst/wiremock/commit/533b248eaeb4133) Nick Ebbitt *2018-02-14 21:04:04*
 
 
## 2.15.0
### GitHub [#831](https://github.com/tomakehurst/wiremock/issues/831) Stack trace with no detail is logged when malformed mapping JSON present at startup.    *Bug*  
 
**Fixed #831 - improved error detail when standalone fails to start due to malformed mapping JSON file**
 
 
[cd29035c84c03e5](https://github.com/tomakehurst/wiremock/commit/cd29035c84c03e5) Tom Akehurst *2018-02-01 16:46:32*
 
 
### GitHub [#850](https://github.com/tomakehurst/wiremock/issues/850) Xml.read() throws a 500 error when given malformed XML    *Bug*  
 
**Fixed #850 - equalToXml matches are now eagerly validated and a 422 returned to the client if they are invalid.**
 
 
[9991b850abcfbb0](https://github.com/tomakehurst/wiremock/commit/9991b850abcfbb0) Tom Akehurst *2018-01-30 12:37:54*
 
 
### GitHub [#853](https://github.com/tomakehurst/wiremock/issues/853) Delays don&#39;t appear to work with proxy stubs    *Bug*  
 
**Fixed #853 - delays not working with proxy stub responses**
 
 
[ad096aabc6daf6a](https://github.com/tomakehurst/wiremock/commit/ad096aabc6daf6a) Tom Akehurst *2018-01-26 15:30:43*
 
 
### GitHub [#863](https://github.com/tomakehurst/wiremock/issues/863) Cannot use bodyBase64 in response since #593    *Bug*  
 
**Fixed #863 - global response templating transformer throws an NPE when a binary body is present**
 
 
[6ef9b6d0c0c1f15](https://github.com/tomakehurst/wiremock/commit/6ef9b6d0c0c1f15) Tom Akehurst *2018-02-05 09:48:59*
 
 
### GitHub [#871](https://github.com/tomakehurst/wiremock/issues/871) EqualToJsonPattern#shouldIgnoreExtra may throw NPE  
 
**Fixed #871 - incorrect check for presence of ignoreArrayOrder when evaluating ignoreExtraElements in equalToJson matcher**
 
 
[8eddc1800d77650](https://github.com/tomakehurst/wiremock/commit/8eddc1800d77650) Tom Akehurst *2018-02-06 10:08:37*
 
 
### No issue
 
**Bumped minor version**
 
 
[9c83ed91fc431cc](https://github.com/tomakehurst/wiremock/commit/9c83ed91fc431cc) Tom Akehurst *2018-02-11 19:45:06*
 
**Added test assertion to ensure NPE not thrown by NearMiss.toString()**
 
 
[678e0352eb3ac85](https://github.com/tomakehurst/wiremock/commit/678e0352eb3ac85) Tom Akehurst *2018-02-11 17:26:49*
 
**Fixed test case failing due to absolute path in assertion text**
 
 
[ce29416c1725201](https://github.com/tomakehurst/wiremock/commit/ce29416c1725201) Tom Akehurst *2018-02-01 17:04:14*
 
**Added missing file intended for previous commit**
 
 
[e0288c190a35c34](https://github.com/tomakehurst/wiremock/commit/e0288c190a35c34) Tom Akehurst *2018-02-01 16:56:39*
 
**Modified response template JSONPath helper model so that output can be passed into e.g. the each helper**
 
 
[315e3f853386441](https://github.com/tomakehurst/wiremock/commit/315e3f853386441) Tom Akehurst *2018-01-26 16:52:51*
 
**Added chunked dribble delay support to proxied responses**
 
 
[def8a6932283dbd](https://github.com/tomakehurst/wiremock/commit/def8a6932283dbd) Tom Akehurst *2018-01-26 15:30:43*
 
**Moved delay test cases from StubbingAcceptanceTest to ResponseDelayAcceptanceTest**
 
 
[88446a22325bc1c](https://github.com/tomakehurst/wiremock/commit/88446a22325bc1c) Tom Akehurst *2018-01-26 15:30:43*
 
**docs: getting-started: fix maven scope**
 
 
[a03c2f01e3d9d21](https://github.com/tomakehurst/wiremock/commit/a03c2f01e3d9d21) Alberto Scotto *2018-01-19 19:49:42*
 
 
## 2.14.0
### GitHub [#849](https://github.com/tomakehurst/wiremock/issues/849) Xml.prettyPrint fails with recent xalan versions    *Feature request*  
 
**XML pretty printing function now attempts to explicitly load the Sun TransformerFactoryImpl, falling back on the default behaviour if that isn't available. This fixes #849 where having Xalan on the classpath causes an exception to be thrown.**
 
 
[d6dbd7e96644715](https://github.com/tomakehurst/wiremock/commit/d6dbd7e96644715) Tom Akehurst *2018-01-12 17:30:38*
 
 
### No issue
 
**Added a doc note indicating that CONNECTION_RESET_BY_PEER fault doesn't work on Windows**
 
 
[6395d759fee402b](https://github.com/tomakehurst/wiremock/commit/6395d759fee402b) Tom Akehurst *2018-01-12 16:20:10*
 
**Removed use of java.nio.Paths for compatibilty with older Android releases. Tweaked copyright messages.**
 
 
[957185267af4dc8](https://github.com/tomakehurst/wiremock/commit/957185267af4dc8) Tom Akehurst *2018-01-12 15:41:25*
 
**Added a test case for deserialisation of insertion index on stub mappings**
 
 
[61de619e7486f20](https://github.com/tomakehurst/wiremock/commit/61de619e7486f20) Tom Akehurst *2018-01-11 13:51:56*
 
**Now includes the insertion index of stub mappings in the 'private' view, which is used when saving to the file system. This is to ensure that insertion order is preserved when re-loading files from disk.**
 
 
[342c36d372f19c2](https://github.com/tomakehurst/wiremock/commit/342c36d372f19c2) Tom Akehurst *2018-01-11 13:05:44*
 
**add runtime switch for base64 encoder**
 
 
[fc047275ea7eda1](https://github.com/tomakehurst/wiremock/commit/fc047275ea7eda1) Marvin Ramin *2018-01-07 12:37:07*
 
**Replace the usage of Path and Paths with File for backward compatibility issues with android API before 26**
 
 
[e5817c759c849d6](https://github.com/tomakehurst/wiremock/commit/e5817c759c849d6) Emanuil Damyanov *2018-01-05 15:45:06*
 
**Added ability to set the console width when rendering ascii diff reports via a header**
 
 
[922fb1a99523312](https://github.com/tomakehurst/wiremock/commit/922fb1a99523312) Tom Akehurst *2018-01-03 19:15:16*
 
**Promoted homepage variant b to be the baseline, with 'Try it now' in addition to 'Learn more'**
 
 
[d84a2722a32f321](https://github.com/tomakehurst/wiremock/commit/d84a2722a32f321) Tom Akehurst *2017-12-30 14:24:13*
 
**Reduced precision of async delay tests to avoid spurious CI failures**
 
 
[e0c544c777689e3](https://github.com/tomakehurst/wiremock/commit/e0c544c777689e3) Tom Akehurst *2017-12-24 17:46:21*
 
**Tweaked async delay test to reduce likelihood of CI server failure**
 
 
[275c36dceb33f8b](https://github.com/tomakehurst/wiremock/commit/275c36dceb33f8b) Tom Akehurst *2017-12-24 17:41:27*
 
**Added extra tests and tweaked some formatting in the async delays feature.**
 
 
[ffd3b14f1cf474f](https://github.com/tomakehurst/wiremock/commit/ffd3b14f1cf474f) Tom Akehurst *2017-12-24 15:55:12*
 
**Scala version 2.11.8 --> 2.11.12**
 
 
[6c3bc99aa1a16da](https://github.com/tomakehurst/wiremock/commit/6c3bc99aa1a16da) Sean Sullivan *2017-12-15 23:51:11*
 
**Promoted homepage variant a to main (mocklab section). Added a b variant with 'Try it now'.**
 
 
[6995434019d1427](https://github.com/tomakehurst/wiremock/commit/6995434019d1427) Tom Akehurst *2017-12-15 11:01:40*
 
**ASCII diff reports are now written to the log when a request is not matched (rather than the JSON representation of request and closest stub)**
 
 
[61fce7d223ad92b](https://github.com/tomakehurst/wiremock/commit/61fce7d223ad92b) Tom Akehurst *2017-12-13 15:01:45*
 
**Added query parameters to diff reports. Fixed bug with cookie matching in diff reports - was previously reporting matching cookies as non-matching.**
 
 
[6e216aeb54e1160](https://github.com/tomakehurst/wiremock/commit/6e216aeb54e1160) Tom Akehurst *2017-12-13 14:16:55*
 
**Ignore bind address tests when no additional network adapter is available to test against**
 
 
[00c9a367f31827d](https://github.com/tomakehurst/wiremock/commit/00c9a367f31827d) Tom Akehurst *2017-12-12 11:18:39*
 
**768 - asynchronous wiremock**
 
 
[26e1dbfbac5d5e0](https://github.com/tomakehurst/wiremock/commit/26e1dbfbac5d5e0) Jerzy Krolak *2017-12-12 06:56:06*
 
**Instantiate directly QueuedThreadPoolFactory.**
 
 
[6cc964d7dbd51fa](https://github.com/tomakehurst/wiremock/commit/6cc964d7dbd51fa) MuSTa1nE *2017-12-08 13:26:59*
 
**Add ThreadPoolFactory to enable custom ThreadPool for Jetty.**
 
 
[f7579e6271419b4](https://github.com/tomakehurst/wiremock/commit/f7579e6271419b4) MuSTa1nE *2017-12-08 10:38:58*
 
**Fixed all but one Windows-specific test failure. Mostly related to string formatting differences due to line break characters.**
 
 
[e56f2b430b2b6a4](https://github.com/tomakehurst/wiremock/commit/e56f2b430b2b6a4) Tom Akehurst *2017-12-07 19:24:26*
 
**Fixing path issues on Windows. The issue was that for a URI "file:/c:/bob" on windows a call to uri.getSchemeSpecificPart() would have returned an incorrect Windows path /c:/bob which was then passed around Wiremock codebase and used as a filename, and resulted in file not found issues further down the line.**
 
 
[3574925d2564846](https://github.com/tomakehurst/wiremock/commit/3574925d2564846) Wojciech Bulaty *2017-12-07 19:24:26*
 
**Admitted defeat and added a platform-specific test fork for non-match formatting**
 
 
[2052106603fce69](https://github.com/tomakehurst/wiremock/commit/2052106603fce69) Tom Akehurst *2017-12-07 19:24:26*
 
**Moved GA scripts to the right place and added appropriate events to links clicked**
 
 
[318258f01080d86](https://github.com/tomakehurst/wiremock/commit/318258f01080d86) Tom Akehurst *2017-12-07 13:38:16*
 
**Tweaked UTM parameters on homepage CTAs to distinguish paths**
 
 
[14a0dc677829f34](https://github.com/tomakehurst/wiremock/commit/14a0dc677829f34) Tom Akehurst *2017-12-06 19:19:07*
 
**Swapped mocklab homepage screenshot and added a window chrome**
 
 
[e06b3e0f0233f64](https://github.com/tomakehurst/wiremock/commit/e06b3e0f0233f64) Tom Akehurst *2017-12-06 19:16:03*
 
**Suppress the mocklab pop-over when on the page containing the homepage section**
 
 
[efcba1a908fb2d2](https://github.com/tomakehurst/wiremock/commit/efcba1a908fb2d2) Tom Akehurst *2017-12-05 11:11:07*
 
**Added Google Optimize to analytics tags**
 
 
[06012ff3feb5217](https://github.com/tomakehurst/wiremock/commit/06012ff3feb5217) Tom Akehurst *2017-12-04 18:55:13*
 
**fixing the travis build**
 
 
[c2cca1d3c7cf9a0](https://github.com/tomakehurst/wiremock/commit/c2cca1d3c7cf9a0) Wojciech Bulaty *2017-12-04 16:24:30*
 
**added an endpoint for deleting body files and listing all body files**
 
 
[bf01453ba11c88b](https://github.com/tomakehurst/wiremock/commit/bf01453ba11c88b) Wojciech Bulaty *2017-12-04 15:56:50*
 
**Misleading error message**
 
 * If there were more  requests than expected, the error message is misleading: 
 * Expected exactly 1 requests [...] but received only 2 
 
[6418dd6bdb9bedd](https://github.com/tomakehurst/wiremock/commit/6418dd6bdb9bedd) Tomasz Nurkiewicz *2017-12-01 15:38:59*
 
**Fixed mobile responsiveness of mocklab homepage section**
 
 
[1063386f2e66a92](https://github.com/tomakehurst/wiremock/commit/1063386f2e66a92) Tom Akehurst *2017-12-01 14:48:33*
 
**First cut of MockLab homepage section**
 
 
[52cb542158473c9](https://github.com/tomakehurst/wiremock/commit/52cb542158473c9) Tom Akehurst *2017-12-01 14:10:11*
 
**Revert "WIP"**
 
 * This reverts commit eda528de920858994d9cc9b16be1089e87f8e41f. 
 
[2efdad527c3c63e](https://github.com/tomakehurst/wiremock/commit/2efdad527c3c63e) Tom Akehurst *2017-12-01 10:57:00*
 
**WIP**
 
 
[eda528de9208589](https://github.com/tomakehurst/wiremock/commit/eda528de9208589) Tom Akehurst *2017-11-30 19:17:31*
 
**Fix build on windows**
 
 
[9b5d9a5213c634f](https://github.com/tomakehurst/wiremock/commit/9b5d9a5213c634f) Anuj Bhatia *2017-11-21 17:01:22*
 
**added an endpoint to edit body files**
 
 
[bdf5dc6639df66e](https://github.com/tomakehurst/wiremock/commit/bdf5dc6639df66e) Wojciech Bulaty *2017-10-05 16:18:22*
 
 
## 2.13.0
### GitHub [#655](https://github.com/tomakehurst/wiremock/issues/655) Trailing Forward Slash being added to Proxy URL     *Bug*  
 
**Preserve trailing slashes if the original request had them. The original issue in #655 was a misunderstanding of how curl behaves.**
 
 
[ded69bba88589d1](https://github.com/tomakehurst/wiremock/commit/ded69bba88589d1) Liam Williams *2017-11-12 19:58:48*
 
 
### No issue
 
**Bumped minor version**
 
 
[067c2ece5bc5711](https://github.com/tomakehurst/wiremock/commit/067c2ece5bc5711) Tom Akehurst *2018-01-02 18:40:30*
 
**Reverted back to parsing a multipart body when testing request pattern matching of multiparts**
 
 
[14bc7c562b79cbe](https://github.com/tomakehurst/wiremock/commit/14bc7c562b79cbe) Tom Akehurst *2018-01-02 18:38:12*
 
**Moved HTTP client multipart body support class to the testsupport package and renamed**
 
 
[040503909fa604b](https://github.com/tomakehurst/wiremock/commit/040503909fa604b) Tom Akehurst *2018-01-02 14:23:02*
 
**Updated docs to reflect changes to multipart matching API**
 
 
[477d5a53d370596](https://github.com/tomakehurst/wiremock/commit/477d5a53d370596) Tom Akehurst *2018-01-02 13:06:28*
 
**Refactored multipart support to make better use of existing classes. Made multipart headers match on a single pattern rather than a collection, for consistency with top-level header matching and to simplify JSON.**
 
 
[8ec60d4c3815d00](https://github.com/tomakehurst/wiremock/commit/8ec60d4c3815d00) Tom Akehurst *2018-01-02 13:03:53*
 
**Tweaked the wording of async configuration option**
 
 
[16332045eb356bb](https://github.com/tomakehurst/wiremock/commit/16332045eb356bb) Tom Akehurst *2018-01-02 10:55:42*
 
**786 - asynchronous wiremock documentation updated**
 
 
[ec2c987470e1269](https://github.com/tomakehurst/wiremock/commit/ec2c987470e1269) Jerzy Krolak *2018-01-02 06:21:53*
 
**Decoupled javax.servlet.http.Part from Request interface**
 
 * Docs: request-matching.md. 
 * Acceptance stub testing with Multipart requests 
 
[06cc489afed197c](https://github.com/tomakehurst/wiremock/commit/06cc489afed197c) Arjan Duijzer *2017-12-25 20:25:13*
 
**Additional test case, formatting and other minor tweaks to multipart feature.**
 
 
[0a496d94aba3172](https://github.com/tomakehurst/wiremock/commit/0a496d94aba3172) Tom Akehurst *2017-12-25 09:09:32*
 
**Multipart Request patterns**
 
 * Aims to provide an extension to RequestPattern matching by providing a plugin in the form of a MultipartValuePattern matcher 
 * Added: 
 * - MultipartValuePattern 
 * - MultipartValuePatternBuilder 
 * Tested in: 
 * - RequestPatternBuilderTest 
 * - RequestPatternTest 
 * - LoggedRequestTest 
 
[083cd1e0d9b0045](https://github.com/tomakehurst/wiremock/commit/083cd1e0d9b0045) Arjan Duijzer *2017-12-25 09:09:32*
 
 
## 2.12.0
### GitHub [#357](https://github.com/tomakehurst/wiremock/issues/357) Vagrant vm box url no longer exists    *Bug*  
 
**update vagrantfile to something that can be used to build wiremock, fixes #357**
 
 
[7897936fc05a3e7](https://github.com/tomakehurst/wiremock/commit/7897936fc05a3e7) eis *2017-11-19 14:20:29*
 
 
### GitHub [#574](https://github.com/tomakehurst/wiremock/issues/574) Verify does not match requests that have not already completed    *Bug*  
 
**Fixed #574 - Move delay logic so that request is received by RequestJournal before delay happens**
 
 
[479074e90e431cf](https://github.com/tomakehurst/wiremock/commit/479074e90e431cf) Paul McGuire and Howard Burgess *2017-11-23 11:27:47*
 
 
### No issue
 
**Improved API errors - now sends 422 errors with json-api structured bodies**
 
 
[47c5d6b6948638b](https://github.com/tomakehurst/wiremock/commit/47c5d6b6948638b) Tom Akehurst *2017-11-30 19:23:29*
 
**Added assertion to relative root path test**
 
 
[ea2f1b8e1769005](https://github.com/tomakehurst/wiremock/commit/ea2f1b8e1769005) Tom Akehurst *2017-11-30 13:43:05*
 
**Tweaked website top navigation so it all fits on a smaller desktop browser, and added the mocklab logo**
 
 
[b2952de246a5755](https://github.com/tomakehurst/wiremock/commit/b2952de246a5755) Tom Akehurst *2017-11-29 11:57:29*
 
**Fixed bug causing NPE in not matched renderer**
 
 
[e7757ba3202ac0d](https://github.com/tomakehurst/wiremock/commit/e7757ba3202ac0d) Tom Akehurst *2017-11-21 18:04:46*
 
**Fixed typo in _docs/extending-wiremock**
 
 * maxLemgth -&gt; maxLength 
 
[d1d0f45eceac648](https://github.com/tomakehurst/wiremock/commit/d1d0f45eceac648) hossameldeen *2017-11-21 09:42:00*
 
**Sometimes you might want to provide the rootPath relative to the current directory, for example ../external/wiremock-files-root. I have made that possible now.**
 
 
[7a5fc88b1e436f6](https://github.com/tomakehurst/wiremock/commit/7a5fc88b1e436f6) Wojciech Bulaty *2017-11-12 14:43:28*
 
**Allow custom Handlebars instance to be used so that e.g. escaping of single quotes can be disabled**
 
 
[ec01189b44136b3](https://github.com/tomakehurst/wiremock/commit/ec01189b44136b3) Liam Williams *2017-11-12 14:26:00*
 
 
## 2.11.0
### GitHub [#797](https://github.com/tomakehurst/wiremock/issues/797) newScenarioState not applied if requiredScenarioState not present in matcher    *Bug*  
 
**Fixed #797 - unable to define a stub in a scenario with no required state**
 
 
[256a4388ad57157](https://github.com/tomakehurst/wiremock/commit/256a4388ad57157) Tom Akehurst *2017-11-09 21:45:44*
 
 
### No issue
 
**Documented the CONNECTION_RESET_BY_PEER fault**
 
 
[adf81e2caa681d4](https://github.com/tomakehurst/wiremock/commit/adf81e2caa681d4) Tom Akehurst *2017-11-10 20:39:26*
 
**Bumped minor version**
 
 
[e5cfd6ab5a94ce1](https://github.com/tomakehurst/wiremock/commit/e5cfd6ab5a94ce1) Tom Akehurst *2017-11-10 20:38:19*
 
**Added support for Jetty 9.4 in fault injection code**
 
 
[e0ba2d9c4be0f2e](https://github.com/tomakehurst/wiremock/commit/e0ba2d9c4be0f2e) Tom Akehurst *2017-11-10 16:35:54*
 
**Tweaked dribble delay doc. Amended dribble delay tests to better measure timings.**
 
 
[8a738ad0a8ffa69](https://github.com/tomakehurst/wiremock/commit/8a738ad0a8ffa69) Tom Akehurst *2017-11-10 11:14:30*
 
**Suppressed InterruptedException when client times out during response dribbling. Modified test case to show timing peculiarity.**
 
 
[797c6d1707d47b6](https://github.com/tomakehurst/wiremock/commit/797c6d1707d47b6) Tom Akehurst *2017-11-10 09:44:32*
 
**Made base64 encoding improvements compatible with Java 7**
 
 
[06c18a35657fe6c](https://github.com/tomakehurst/wiremock/commit/06c18a35657fe6c) Marshall Bradley *2017-11-08 09:58:30*
 
**Switched base64 encoding library to better performing native Java 8 (http://java-performance.info/base64-encoding-and-decoding-performance/)**
 
 
[4394028d6fccc37](https://github.com/tomakehurst/wiremock/commit/4394028d6fccc37) Marshall Bradley *2017-11-07 13:53:40*
 
**Added a test showing a failure case for the byte dribbling feature**
 
 
[fc967019ed608f4](https://github.com/tomakehurst/wiremock/commit/fc967019ed608f4) Tom Akehurst *2017-10-31 10:20:14*
 
**Adds missing license information to new chunked dribble delay files**
 
 
[f95e9d08d9e5c0c](https://github.com/tomakehurst/wiremock/commit/f95e9d08d9e5c0c) Adam Dougal *2017-10-30 14:13:07*
 
**Fix issue where chunked dribble delay was not copied over when using ResponseDefinitionBuilder.like()**
 
 
[bc43a1053150a76](https://github.com/tomakehurst/wiremock/commit/bc43a1053150a76) Adam Dougal *2017-10-30 14:11:50*
 
**Allow equalToJson to accept unencoded JSON**
 
 * This allows setting &quot;equalToJson&quot; to a raw JSON value when submitting a 
 * request matcher to the API. I updated the serialization code so it will 
 * write an unencoded string if the original was unencoded. 
 
[06a5de1096eb2ad](https://github.com/tomakehurst/wiremock/commit/06a5de1096eb2ad) Mason Malone *2017-10-29 05:57:04*
 
**Adds chunked dribble delay feature**
 
 
[2076c4fbf67231b](https://github.com/tomakehurst/wiremock/commit/2076c4fbf67231b) Adam Dougal *2017-10-26 15:21:31*
 
**Add RequestPatternBuilder.like() and but() methods**
 
 * Sometimes, when writing a StubMappingTransformer extension, you want to 
 * change a single field in the RequestPattern (e.g. the URL). This is 
 * difficult because RequestPattern is immutable and RequestPatternBuilder 
 * can&#39;t build off an existing object the way ResponseDefinitionBuilder 
 * can. 
 * This adds two new methods to RequestPatternBuilder, like() and but(), 
 * that do the same thing as the corresponding methods in 
 * ResponseDefinitionBuilder. 
 
[191300ac000b964](https://github.com/tomakehurst/wiremock/commit/191300ac000b964) Mason Malone *2017-10-25 04:54:24*
 
**Better fix for deleting/writing files in subdirectories**
 
 
[870bea08105bb52](https://github.com/tomakehurst/wiremock/commit/870bea08105bb52) Mason Malone *2017-10-23 04:18:05*
 
**Fix JsonFileMappingsSource.remove() for subdirectories**
 
 * The &quot;JsonFileMappingsSource.loadingMappingsInfo()&quot; method looks for JSON 
 * files in the mappings directory recursively, which is useful since it 
 * allows organizing stubs in a directory hierachy. However, the &quot;remove()&quot; 
 * and &quot;removeAll()&quot; methods will not remove stubs in a subdirectory, 
 * because the path components are stripped out of the filename. 
 * This was introduced in 7f93b5eb996722c1919a6e1e627d550f7929ac39, which 
 * changed the &quot;getFileName()&quot; to strip out all path compontents. I updated 
 * that method to only do so for non-file URLs. 
 
[e6ccab149f00a13](https://github.com/tomakehurst/wiremock/commit/e6ccab149f00a13) Mason Malone *2017-10-22 05:58:35*
 
 
## 2.10.1
### No issue
 
**Added operator names to header and cookie lines in the not matched text rendered view**
 
 
[6ac811e2cf9e6c7](https://github.com/tomakehurst/wiremock/commit/6ac811e2cf9e6c7) Tom Akehurst *2017-10-22 19:09:09*
 
**Removed spurious import**
 
 
[a71135cacf21d7c](https://github.com/tomakehurst/wiremock/commit/a71135cacf21d7c) Tom Akehurst *2017-10-22 18:23:04*
 
**Bumped the patch version**
 
 
[8ddcb5155c47794](https://github.com/tomakehurst/wiremock/commit/8ddcb5155c47794) Tom Akehurst *2017-10-22 18:21:56*
 
**Added weighting to match aggregation and a high weighting to URLs when matching requests**
 
 
[41545ee3d0a4aba](https://github.com/tomakehurst/wiremock/commit/41545ee3d0a4aba) Tom Akehurst *2017-10-22 18:21:39*
 
 
## 2.10.0
### GitHub [#676](https://github.com/tomakehurst/wiremock/issues/676) What does WireMockRule.failOnUnmatchedStubs do?    *Bug*  
 
**changes 'failOnUnmatchedStubs' to 'failOnUnmatchedRequests' like intended. Fixes #676.**
 
 
[351c7b24486acf6](https://github.com/tomakehurst/wiremock/commit/351c7b24486acf6) eis *2017-10-02 18:21:17*
 
 
### GitHub [#691](https://github.com/tomakehurst/wiremock/issues/691) NullPointerException in com.github.tomakehurst.wiremock.matching.EqualToJsonPattern.getNode during record    *Bug*  
 
**Fix issue with nullpointer. #691**
 
 
[930132307eb7243](https://github.com/tomakehurst/wiremock/commit/930132307eb7243) Jonatan Karlsson *2017-10-13 09:31:10*
 
**Add test to prove issue #691**
 
 
[4f54bde5fb2718b](https://github.com/tomakehurst/wiremock/commit/4f54bde5fb2718b) Jonatan Karlsson *2017-10-11 13:47:39*
 
 
### No issue
 
**Fix ResponseDefinitionBuilder.like() to copy transformerParameters**
 
 * When ResponseDefinitionBuilder.like() was called with a 
 * ResponseDefinition that had transformer parameters, it just copied the 
 * reference. This means subsequent calls to &quot;withTransformerParameter()&quot; 
 * would modify the original object. 
 
[b8a921500fd6900](https://github.com/tomakehurst/wiremock/commit/b8a921500fd6900) Mason Malone *2017-10-22 06:57:13*
 
**Bumped minor version**
 
 
[e220479ac647070](https://github.com/tomakehurst/wiremock/commit/e220479ac647070) Tom Akehurst *2017-10-20 20:41:51*
 
**Replaced recording-based test for JSON equality NPE bug with unit tests**
 
 
[9086dad7953eca0](https://github.com/tomakehurst/wiremock/commit/9086dad7953eca0) Tom Akehurst *2017-10-19 15:22:44*
 
**Corrected verification via custom matcher doc**
 
 
[00b2255524b44eb](https://github.com/tomakehurst/wiremock/commit/00b2255524b44eb) Tom Akehurst *2017-10-18 19:30:52*
 
**Added support for multi-valued cookies**
 
 
[827e7ccb3edcb15](https://github.com/tomakehurst/wiremock/commit/827e7ccb3edcb15) Tom Akehurst *2017-10-18 16:16:36*
 
**Now accepts a custom 404 page renderer, and if not provided uses a default renderer that outputs the nearest miss diff as formatted ascii**
 
 
[336fc234435c33e](https://github.com/tomakehurst/wiremock/commit/336fc234435c33e) Tom Akehurst *2017-10-18 09:31:44*
 
**Added test case for verification with a custom matcher**
 
 
[46c9a6b6dc80104](https://github.com/tomakehurst/wiremock/commit/46c9a6b6dc80104) Tom Akehurst *2017-10-17 11:50:48*
 
**Document the usage of RequestMatcherExtension with WireMock.verify**
 
 
[4ce3faaaae7b47b](https://github.com/tomakehurst/wiremock/commit/4ce3faaaae7b47b) Gervais Blaise *2017-10-16 09:26:26*
 
**Restored HttpAdminClient constructor overload accidentally removed**
 
 
[4e7bc0853569c05](https://github.com/tomakehurst/wiremock/commit/4e7bc0853569c05) Tom Akehurst *2017-10-15 10:41:41*
 
**Added get scenarios to RAML spec**
 
 
[dbbf8b74391750e](https://github.com/tomakehurst/wiremock/commit/dbbf8b74391750e) Tom Akehurst *2017-10-10 10:18:41*
 
**Added get scenarios API doc section**
 
 
[61e6cabf955a7ea](https://github.com/tomakehurst/wiremock/commit/61e6cabf955a7ea) Tom Akehurst *2017-10-10 09:06:14*
 
**Fixed formatting in standalone doc page**
 
 
[e47de0c1807db80](https://github.com/tomakehurst/wiremock/commit/e47de0c1807db80) Tom Akehurst *2017-10-10 08:59:33*
 
**Fixed bug allowing duplicate states to be added to Scenario.possibleStates**
 
 
[3e39d3350339dcf](https://github.com/tomakehurst/wiremock/commit/3e39d3350339dcf) Tom Akehurst *2017-10-09 13:38:33*
 
**Fixed bug with new scenarios view - now removes a scenario from the collection if a stub has its scenario name changed. Fixed test case with port number fixed to 8080.**
 
 
[b636a540af1656d](https://github.com/tomakehurst/wiremock/commit/b636a540af1656d) Tom Akehurst *2017-10-09 12:42:20*
 
**Allow non-master local publishing**
 
 
[5fcf214006e17ca](https://github.com/tomakehurst/wiremock/commit/5fcf214006e17ca) Tom Akehurst *2017-10-05 17:59:03*
 
**Bumped minor version**
 
 
[6148e4354a09fa8](https://github.com/tomakehurst/wiremock/commit/6148e4354a09fa8) Tom Akehurst *2017-10-05 17:54:59*
 
**Switched scenario GET API to return a list. Added names and UUIDs to scenarios.**
 
 
[e424d20f146512c](https://github.com/tomakehurst/wiremock/commit/e424d20f146512c) Tom Akehurst *2017-10-05 17:53:56*
 
**Refactored scenarios code and added API for retrieving scenario metadata**
 
 
[8a7e0d1eba28a1d](https://github.com/tomakehurst/wiremock/commit/8a7e0d1eba28a1d) Tom Akehurst *2017-10-05 15:50:27*
 
**Formatting**
 
 
[77aa88262f1d6ea](https://github.com/tomakehurst/wiremock/commit/77aa88262f1d6ea) Tom Akehurst *2017-10-04 09:17:11*
 
**Added missing type parameter to List in method signature in VerificationException**
 
 
[26ea1af44d908de](https://github.com/tomakehurst/wiremock/commit/26ea1af44d908de) Tom Akehurst *2017-10-04 09:15:32*
 
**Remove Oracle JDK7 from Travis build as no longer supported. Add workaround for Gradle wrapper download problem.**
 
 
[a8b4e1f04c07fc7](https://github.com/tomakehurst/wiremock/commit/a8b4e1f04c07fc7) Tom Akehurst *2017-10-04 08:49:27*
 
**Upgrading to Gradle 4.2.1 in the vain hope it will fix Travis problems**
 
 
[40005fa1fb1c3b4](https://github.com/tomakehurst/wiremock/commit/40005fa1fb1c3b4) Tom Akehurst *2017-10-04 08:41:32*
 
**Another attempt at getting the new Travis machine image and openjdk8 to work**
 
 
[5d29c98a3a68dab](https://github.com/tomakehurst/wiremock/commit/5d29c98a3a68dab) Tom Akehurst *2017-10-04 08:34:06*
 
**Added MockLab callouts to the docs**
 
 
[2310464cf7470ae](https://github.com/tomakehurst/wiremock/commit/2310464cf7470ae) Tom Akehurst *2017-09-27 14:04:44*
 
**Tweaked Consulting link text in docs**
 
 
[0ef7acfb1e47144](https://github.com/tomakehurst/wiremock/commit/0ef7acfb1e47144) Tom Akehurst *2017-09-27 10:57:31*
 
**Added GA event to Consulting Services link in docs**
 
 
[1735e8603efbdc3](https://github.com/tomakehurst/wiremock/commit/1735e8603efbdc3) Tom Akehurst *2017-09-26 11:14:56*
 
**Added some additional external resources to the docs**
 
 
[f95e9cdb534238b](https://github.com/tomakehurst/wiremock/commit/f95e9cdb534238b) Tom Akehurst *2017-09-26 11:11:36*
 
**Added consulting link to top nav on the website**
 
 
[228da0a74c19453](https://github.com/tomakehurst/wiremock/commit/228da0a74c19453) Tom Akehurst *2017-09-25 10:56:50*
 
**Wire up stop timeout for embedded Jetty server**
 
 
[90252893378459a](https://github.com/tomakehurst/wiremock/commit/90252893378459a) Eric Fry *2017-09-11 01:01:01*
 
**Add convenience WireMockServer.url builder method**
 
 
[3ead9eb702ea081](https://github.com/tomakehurst/wiremock/commit/3ead9eb702ea081) Mark Hobson *2017-09-08 20:56:28*
 
**Added overload which calls main constructor**
 
 
[95489ff4ac57a09](https://github.com/tomakehurst/wiremock/commit/95489ff4ac57a09) George Granberry *2017-09-04 14:57:03*
 
 
## 2.9.0
### No issue
 
**Remove deprecated guava API usage as it breaks with Guava version 23.0 and newer**
 
 
[3e55929baf123a9](https://github.com/tomakehurst/wiremock/commit/3e55929baf123a9) Michal Šváb *2017-10-11 15:01:43*
 
**Fixed formatting in ClientAuthenticationAcceptanceTest.java**
 
 
[648c2a066ca2395](https://github.com/tomakehurst/wiremock/commit/648c2a066ca2395) Tom Akehurst *2017-10-11 13:24:59*
 
**Added CLI options for requiring HTTPS and basic auth on admin API**
 
 
[76231f6e6484b6a](https://github.com/tomakehurst/wiremock/commit/76231f6e6484b6a) Tom Akehurst *2017-10-11 13:21:04*
 
**Added support for requiring HTTPS on the admin API**
 
 
[f254a4ab7d9e2fa](https://github.com/tomakehurst/wiremock/commit/f254a4ab7d9e2fa) Tom Akehurst *2017-10-11 13:04:30*
 
**Added HTTP Basic authenticators**
 
 
[b68a5afc35dac57](https://github.com/tomakehurst/wiremock/commit/b68a5afc35dac57) Tom Akehurst *2017-10-11 11:06:04*
 
**Added extension points for admin API authentication**
 
 
[51d5ec3fee64e45](https://github.com/tomakehurst/wiremock/commit/51d5ec3fee64e45) Tom Akehurst *2017-10-10 17:20:59*
 
 
## 2.8.0
### GitHub [#655](https://github.com/tomakehurst/wiremock/issues/655) Trailing Forward Slash being added to Proxy URL     *Bug*  
 
**Issue #655 - Added check to remove trailing forward slash if found in proxy URL**
 
 
[2330049834abf8f](https://github.com/tomakehurst/wiremock/commit/2330049834abf8f) kieran.obrien *2017-05-02 09:01:39*
 
 
### No issue
 
**Added missing copyright headers**
 
 
[4326757f1c3982b](https://github.com/tomakehurst/wiremock/commit/4326757f1c3982b) Tom Akehurst *2017-09-01 12:45:10*
 
**Bumped minor version**
 
 
[2bd6c76fb699aea](https://github.com/tomakehurst/wiremock/commit/2bd6c76fb699aea) Tom Akehurst *2017-09-01 12:43:59*
 
**Added test and docs for advanced XPath matching against complex elements**
 
 
[c79398418caa425](https://github.com/tomakehurst/wiremock/commit/c79398418caa425) Tom Akehurst *2017-09-01 12:43:36*
 
**Added docs for advanced JSONPath and XPath matching**
 
 
[3d4e34d549c28aa](https://github.com/tomakehurst/wiremock/commit/3d4e34d549c28aa) Tom Akehurst *2017-09-01 12:32:37*
 
**Added advanced JSONPath and XPath matching**
 
 
[31fd990bd989b88](https://github.com/tomakehurst/wiremock/commit/31fd990bd989b88) Tom Akehurst *2017-09-01 11:41:24*
 
**Fixed typo in test**
 
 
[e7cbffca37cdec6](https://github.com/tomakehurst/wiremock/commit/e7cbffca37cdec6) Tom Akehurst *2017-08-30 11:46:38*
 
**Added a test for find requests with multi-valued headers**
 
 
[87957dae97f0940](https://github.com/tomakehurst/wiremock/commit/87957dae97f0940) Tom Akehurst *2017-08-30 11:42:10*
 
**Added an acceptance test for proxy trailing slash stripping**
 
 
[a9c20e5cfb1f513](https://github.com/tomakehurst/wiremock/commit/a9c20e5cfb1f513) Tom Akehurst *2017-08-29 08:42:56*
 
**Added Spring Boot doc page**
 
 
[1e8521a105208c1](https://github.com/tomakehurst/wiremock/commit/1e8521a105208c1) Tom Akehurst *2017-08-28 21:11:00*
 
**Added docs for xpath and jsonpath handlebars helpers**
 
 
[b50eafc8376d509](https://github.com/tomakehurst/wiremock/commit/b50eafc8376d509) Tom Akehurst *2017-08-26 09:50:52*
 
**Added support for rendering XML fragments in response templates via the xpath Handlebars helper**
 
 
[3850c26fdba2560](https://github.com/tomakehurst/wiremock/commit/3850c26fdba2560) Tom Akehurst *2017-08-24 09:31:33*
 
**Re-removed openjdk8 from the Travis build as this seems not to work with the precise build**
 
 
[27171feb2e75099](https://github.com/tomakehurst/wiremock/commit/27171feb2e75099) Tom Akehurst *2017-08-22 06:34:38*
 
**Switching Travis build to dist:precise**
 
 
[57ca0b70f56e818](https://github.com/tomakehurst/wiremock/commit/57ca0b70f56e818) Tom Akehurst *2017-08-21 21:44:47*
 
**Fixed a copyright header. Added --no-daemon to Travis build command.**
 
 
[8896029264f9d0b](https://github.com/tomakehurst/wiremock/commit/8896029264f9d0b) Tom Akehurst *2017-08-21 21:40:31*
 
**Upgraded Gradle. Added openjdk8 to travis config. Added --stacktrace to travis command.**
 
 
[b810a24b363da14](https://github.com/tomakehurst/wiremock/commit/b810a24b363da14) Tom Akehurst *2017-08-21 21:33:37*
 
**Added support for extracting JSON objects and arrays from request bodies via helpers**
 
 
[0d2b2af60784c12](https://github.com/tomakehurst/wiremock/commit/0d2b2af60784c12) Tom Akehurst *2017-08-11 12:39:15*
 
**Tweaked error messaging and tests for xpath and jsonpath handlebars helpers**
 
 
[212d5880a087bc9](https://github.com/tomakehurst/wiremock/commit/212d5880a087bc9) Tom Akehurst *2017-08-11 12:30:20*
 
**-added more tests**
 
 * -catch JsonPathException to handle all possible exceptions from JsonPath. 
 
[99ae293b349aff9](https://github.com/tomakehurst/wiremock/commit/99ae293b349aff9) holomekc *2017-08-08 19:23:06*
 
**added wiremock exclusive handlebars helpers:**
 
 * -wmXml: allows to search body content via xPath 
 * -wmSoap: is the same as wmXml but just with prefix /Envelope/Body 
 * -wmJson: allows to search body content via JsonPath 
 * -added com.jayway.jsonpath:json-path:2.2.0 to dependencies which allows the JsonPath implementation 
 
[ccef888b120013d](https://github.com/tomakehurst/wiremock/commit/ccef888b120013d) holomekc *2017-08-07 19:27:41*
 
**Added some missing copyright headers**
 
 
[4c043c4d6969413](https://github.com/tomakehurst/wiremock/commit/4c043c4d6969413) Tom Akehurst *2017-07-31 13:37:50*
 
**Update docs to extending docs to new getName method**
 
 
[e02b32ffd0b049e](https://github.com/tomakehurst/wiremock/commit/e02b32ffd0b049e) Erik Tank *2017-07-14 03:38:39*
 
**enable stopTimeout option for jetty**
 
 
[97e06aa225343b2](https://github.com/tomakehurst/wiremock/commit/97e06aa225343b2) Neil Green *2017-07-05 15:41:40*
 
**remove comment**
 
 
[c9335e628758d96](https://github.com/tomakehurst/wiremock/commit/c9335e628758d96) Stephen Owens *2017-07-04 11:09:42*
 
**add tests to verify non-utf8 charset handling**
 
 
[d1431b4fe397bc6](https://github.com/tomakehurst/wiremock/commit/d1431b4fe397bc6) Stephen Owens *2017-07-03 13:49:48*
 
**obeying the charset specified in the content-type header**
 
 
[5b0d397243b644a](https://github.com/tomakehurst/wiremock/commit/5b0d397243b644a) Stephen Owens *2017-06-26 23:40:18*
 
**Add CONNECTION_RESET_BY_PEER fault to raml response definition schema**
 
 
[7e693de1e1ed54b](https://github.com/tomakehurst/wiremock/commit/7e693de1e1ed54b) Andrei Iacob *2017-06-16 16:34:34*
 
**Adding new type of fault, CONNECTION_RESET_BY_PEER**
 
 
[6af50bf145d436c](https://github.com/tomakehurst/wiremock/commit/6af50bf145d436c) Andrei Iacob *2017-06-15 19:55:33*
 
 
## 2.7.1
### No issue
 
**Bumped patch version**
 
 
[a6a2637d66d66b6](https://github.com/tomakehurst/wiremock/commit/a6a2637d66d66b6) Tom Akehurst *2017-07-31 12:49:10*
 
**Removed dependency on Jetty's HttpStatus class due to reports that this breaks when used with Spring Boot**
 
 
[4e7d5256437d9e5](https://github.com/tomakehurst/wiremock/commit/4e7d5256437d9e5) Tom Akehurst *2017-07-31 12:48:59*
 
 
## 2.7.0
### GitHub [#542](https://github.com/tomakehurst/wiremock/issues/542) GZipped requests when using recording and playback feature  
 
**Fixed #542 - request body not send gzipped via the proxy when original request was gzipped**
 
 
[e9ab585f83cf467](https://github.com/tomakehurst/wiremock/commit/e9ab585f83cf467) Tom Akehurst *2017-07-19 11:14:07*
 
 
### GitHub [#546](https://github.com/tomakehurst/wiremock/issues/546) New stub mapping record/playback feature    *Feature request*  
 
**Issue #546 - New stub mapping recording endpoint**
 
 * This adds a new API endpoint, &quot;/__admin/snapshot&quot;, for recording stub 
 * mappings from the request journal. It&#39;s an alternative to the 
 * &quot;Record &amp; Playback&quot; feature that does not require restarting the 
 * server, and has additional customization options. 
 * The &quot;/__admin/snapshot&quot; endpoint accepts POST requests with the 
 * following options as a JSON object: 
 * &quot;filters&quot; - Request patterns to use for determining which requests 
 * for which to create stub mappings. 
 * Possible values: Identical to &quot;/__admin/requests/find&quot;. See the 
 * Request Matching docs for details. 
 * Default: no filtering. 
 * &quot;persist&quot; - If set to true, persist stub mappings to disk. Otherwise, 
 * just output stub mappings. 
 * Possible values: true, false 
 * Default: true 
 * &quot;sortFields&quot; - Array of fields in the request to use for sorting stub 
 * mappings, mainly for output. 
 * Possible values: &quot;url&quot;, &quot;method&quot;, or a header name (e.g. &quot;Accept&quot;) 
 * Default: no sorting. 
 * &quot;captureHeaders&quot; - Header matchers for including headers in the 
 * stub mapping. The request is matched against each matcher, and the 
 * associated header is added to the stub mapping if there&#39;s a match. 
 * Possible values: Request matchers for headers. 
 * Default: none 
 * &quot;outputFormat&quot; - Determines response body. 
 * Possible values: &quot;ids&quot; to return array of stub mapping IDs, &quot;full&quot; 
 * to return array of stub mapping objects 
 * Default: &quot;ids&quot; 
 
[31459fdafc267b2](https://github.com/tomakehurst/wiremock/commit/31459fdafc267b2) Mason Malone *2017-05-30 02:12:55*
 
 
### No issue
 
**Updated the docs with details of the new binary equality matcher**
 
 
[7610d003720e1b3](https://github.com/tomakehurst/wiremock/commit/7610d003720e1b3) Tom Akehurst *2017-07-27 14:07:33*
 
**Recorder now uses the new binary equality operator when binary request bodies are captured**
 
 
[edbe9fcec03bbc7](https://github.com/tomakehurst/wiremock/commit/edbe9fcec03bbc7) Tom Akehurst *2017-07-27 13:44:39*
 
**Added binary request body equality matching**
 
 
[b4fd12e46a9650b](https://github.com/tomakehurst/wiremock/commit/b4fd12e46a9650b) Tom Akehurst *2017-07-27 11:28:24*
 
**Tweaked record spec DSL**
 
 
[33024344f292e3a](https://github.com/tomakehurst/wiremock/commit/33024344f292e3a) Tom Akehurst *2017-07-26 11:18:59*
 
**Add another hack to use AnythingPattern for binary bodies**
 
 
[43e84c5f7a87989](https://github.com/tomakehurst/wiremock/commit/43e84c5f7a87989) Mason Malone *2017-07-26 08:05:16*
 
**Add hack to use AnythingPattern in RequestBodyAutomaticPatternFactory for multipart/form**
 
 
[095d38d6b8879d1](https://github.com/tomakehurst/wiremock/commit/095d38d6b8879d1) Mason Malone *2017-07-26 08:01:51*
 
**Minor code cleanup (mostly comments)**
 
 
[079a13ca496a794](https://github.com/tomakehurst/wiremock/commit/079a13ca496a794) Mason Malone *2017-07-26 05:31:11*
 
**Couple minor corrections to record-playback.md**
 
 
[5b1e23a65430f40](https://github.com/tomakehurst/wiremock/commit/5b1e23a65430f40) Mason Malone *2017-07-26 04:54:30*
 
**Remove now-unused idGenerator from JsonFileMappingsSource**
 
 
[bb4c907414fe50a](https://github.com/tomakehurst/wiremock/commit/bb4c907414fe50a) Mason Malone *2017-07-26 04:35:14*
 
**Cleanup for tests**
 
 
[b153c01ff0f9ea4](https://github.com/tomakehurst/wiremock/commit/b153c01ff0f9ea4) Mason Malone *2017-07-25 02:54:32*
 
**Move ScenarioProcessorTest.java and SnapshotRecordResultDeserialiserTest.java to the right package**
 
 
[b52a0800d9e4cfd](https://github.com/tomakehurst/wiremock/commit/b52a0800d9e4cfd) Mason Malone *2017-07-25 02:00:43*
 
**Add some tests for SnapshotStubMappingBodyExtractor**
 
 
[15cb88d70309ede](https://github.com/tomakehurst/wiremock/commit/15cb88d70309ede) Mason Malone *2017-07-24 06:54:05*
 
**More flexibility with request body matching**
 
 
[17fdbe6c71b9730](https://github.com/tomakehurst/wiremock/commit/17fdbe6c71b9730) Mason Malone *2017-07-23 04:19:03*
 
**Documented case-insensitive equality matching. Added links to some new external resources.**
 
 
[6826ae39bc7f49e](https://github.com/tomakehurst/wiremock/commit/6826ae39bc7f49e) Tom Akehurst *2017-07-20 18:36:17*
 
**Updated the RAML spec with new recording APIs**
 
 
[7d14269e8b2eb41](https://github.com/tomakehurst/wiremock/commit/7d14269e8b2eb41) Tom Akehurst *2017-07-20 18:06:54*
 
**Removed record snapshot methods from the Stubbing interface for consistency (now they're just present on Admin)**
 
 
[c642dfb0c470fb2](https://github.com/tomakehurst/wiremock/commit/c642dfb0c470fb2) Tom Akehurst *2017-07-20 17:39:13*
 
**Now defaults to always writing binary response body files when recording (regardless of size) and writing text files over 10kb**
 
 
[e59fa382e625417](https://github.com/tomakehurst/wiremock/commit/e59fa382e625417) Tom Akehurst *2017-07-20 17:31:34*
 
**Fixed handling of gzipped responses in the new recorder**
 
 
[24610f2c7e066b5](https://github.com/tomakehurst/wiremock/commit/24610f2c7e066b5) Tom Akehurst *2017-07-20 17:08:04*
 
**Excluded transfer-encoding response header during recording (as this is calculated)**
 
 
[4dc9c8ff62233e6](https://github.com/tomakehurst/wiremock/commit/4dc9c8ff62233e6) Tom Akehurst *2017-07-20 16:15:40*
 
**Added documentation for the new recorder**
 
 
[d373555a471c148](https://github.com/tomakehurst/wiremock/commit/d373555a471c148) Tom Akehurst *2017-07-20 15:56:02*
 
**Recorded body files are now given the same name as the stub mapping (with the appropriate extension)**
 
 
[0f0a59f9bfbefc9](https://github.com/tomakehurst/wiremock/commit/0f0a59f9bfbefc9) Tom Akehurst *2017-07-19 18:43:22*
 
**Added safe filename generation for the case where a stub mapping matches any URL**
 
 
[3598c1cb65b7960](https://github.com/tomakehurst/wiremock/commit/3598c1cb65b7960) Tom Akehurst *2017-07-19 16:51:05*
 
**Mappings source now generates filenames based on stub name and ID, or URL and ID if no name present**
 
 
[cb5fd165e6d5b18](https://github.com/tomakehurst/wiremock/commit/cb5fd165e6d5b18) Tom Akehurst *2017-07-19 16:46:15*
 
**Recorder now sets the stub name to one made safe from the URL path**
 
 
[16081001faa3363](https://github.com/tomakehurst/wiremock/commit/16081001faa3363) Tom Akehurst *2017-07-19 16:18:05*
 
**Removed some redundant code from the build file**
 
 
[874c4edf8e12cbb](https://github.com/tomakehurst/wiremock/commit/874c4edf8e12cbb) Tom Akehurst *2017-07-19 14:47:54*
 
**Bumped minor version**
 
 
[5eb0d377ba02c80](https://github.com/tomakehurst/wiremock/commit/5eb0d377ba02c80) Tom Akehurst *2017-07-19 14:38:55*
 
**Split out bump patch and minor version build tasks**
 
 
[9fa0cba0b9a1352](https://github.com/tomakehurst/wiremock/commit/9fa0cba0b9a1352) Tom Akehurst *2017-07-19 14:38:33*
 
**Correct WireMock version number in the RAML spec**
 
 
[e7169181d0bc876](https://github.com/tomakehurst/wiremock/commit/e7169181d0bc876) Tom Akehurst *2017-07-19 14:15:54*
 
**Added missing copyright headers**
 
 
[6d095798fa6344e](https://github.com/tomakehurst/wiremock/commit/6d095798fa6344e) Tom Akehurst *2017-07-19 14:14:06*
 
**Removed redundant equals and hashCode from Recorder.State**
 
 
[f7ce1ca4645e25e](https://github.com/tomakehurst/wiremock/commit/f7ce1ca4645e25e) Tom Akehurst *2017-07-19 08:56:20*
 
**Added basic validation of record spec on start recording (just checking existence of base URL)**
 
 
[82aec54d8902416](https://github.com/tomakehurst/wiremock/commit/82aec54d8902416) Tom Akehurst *2017-07-19 08:53:45*
 
**Fixed behaviour of persist flag when recording. Fixed scenario flag serialisation.**
 
 
[e35a8aed87710e3](https://github.com/tomakehurst/wiremock/commit/e35a8aed87710e3) Tom Akehurst *2017-07-18 21:19:28*
 
**Added log messages for start and stop recording**
 
 
[8508d5236ab8d8b](https://github.com/tomakehurst/wiremock/commit/8508d5236ab8d8b) Tom Akehurst *2017-07-18 20:44:06*
 
**Added a basic UI for recording**
 
 
[8c52e66340c1c23](https://github.com/tomakehurst/wiremock/commit/8c52e66340c1c23) Tom Akehurst *2017-07-18 20:36:29*
 
**Now sends a client error response/throws exception when attempting to stop recording when not started**
 
 
[33febb15ee4ddae](https://github.com/tomakehurst/wiremock/commit/33febb15ee4ddae) Tom Akehurst *2017-07-18 14:55:41*
 
**Added recording status API/DSL call**
 
 
[7916bda9884f050](https://github.com/tomakehurst/wiremock/commit/7916bda9884f050) Tom Akehurst *2017-07-17 18:29:24*
 
**Added a test case for starting/stopping recording via the API. Add a no-op when trying to start recording when already started.**
 
 
[05ee6496fdb4b81](https://github.com/tomakehurst/wiremock/commit/05ee6496fdb4b81) Tom Akehurst *2017-07-17 17:42:36*
 
**Added direct DSL support for stop/start recording**
 
 
[c35a86b6519a09e](https://github.com/tomakehurst/wiremock/commit/c35a86b6519a09e) Tom Akehurst *2017-07-17 16:47:04*
 
**Renamed SnapshotSpec to RecordSpec**
 
 
[a729a799dbc645d](https://github.com/tomakehurst/wiremock/commit/a729a799dbc645d) Tom Akehurst *2017-07-17 16:41:56*
 
**Added start/stop recording via the remote DSL and added spec support**
 
 
[8c9271999379b7d](https://github.com/tomakehurst/wiremock/commit/8c9271999379b7d) Tom Akehurst *2017-07-17 16:25:02*
 
**Added basics of start/stop recording**
 
 
[74ea12d1ecf3ee2](https://github.com/tomakehurst/wiremock/commit/74ea12d1ecf3ee2) Tom Akehurst *2017-07-17 15:26:54*
 
**Moved new snapshot recording code into 'recording' package**
 
 
[f3f597b932d7c1a](https://github.com/tomakehurst/wiremock/commit/f3f597b932d7c1a) Tom Akehurst *2017-07-17 13:09:08*
 
**Added JSON matching flags to snapshot recording**
 
 
[592261588b6816b](https://github.com/tomakehurst/wiremock/commit/592261588b6816b) Tom Akehurst *2017-07-17 12:17:16*
 
**Added capture headers support to the snapshot DSL**
 
 
[073daa311bbfbe9](https://github.com/tomakehurst/wiremock/commit/073daa311bbfbe9) Tom Akehurst *2017-07-12 18:22:00*
 
**Modified captured headers behaviour when snapshot recording to use the header value received in the request rather than a pre-supplied value**
 
 
[4cf358454164007](https://github.com/tomakehurst/wiremock/commit/4cf358454164007) Tom Akehurst *2017-07-12 17:31:32*
 
**Made SnapshotSpec default constructor private for neatness**
 
 
[d1f953870afb3c0](https://github.com/tomakehurst/wiremock/commit/d1f953870afb3c0) Tom Akehurst *2017-07-12 15:02:06*
 
**Made scenario generation the default setting when snapshot recording**
 
 
[370ae9ddd1c7640](https://github.com/tomakehurst/wiremock/commit/370ae9ddd1c7640) Tom Akehurst *2017-07-12 14:58:52*
 
**Added support for transformers and parameters in the snapshot DSL**
 
 
[9152458d5048dc8](https://github.com/tomakehurst/wiremock/commit/9152458d5048dc8) Tom Akehurst *2017-07-12 14:54:44*
 
**Fixed some serialisation problems and ensured DSL tests for snapshot spec features all go over the wire (thus testing two-way serialisation).**
 
 
[7b55d023fdb73f9](https://github.com/tomakehurst/wiremock/commit/7b55d023fdb73f9) Tom Akehurst *2017-07-12 11:53:37*
 
**Added DSL support and tests for scenario building. Fixed bug with scenario state setting and refactored scenario building code.**
 
 
[e9205f01f13542f](https://github.com/tomakehurst/wiremock/commit/e9205f01f13542f) Tom Akehurst *2017-07-12 11:14:55*
 
**Add tests for SnapshotStubMappingPostProcessor**
 
 
[91b05498bd244e2](https://github.com/tomakehurst/wiremock/commit/91b05498bd244e2) Mason Malone *2017-07-12 04:41:01*
 
**Added support for filtering by ID via the snapshot DSL**
 
 
[6c3637138e4b109](https://github.com/tomakehurst/wiremock/commit/6c3637138e4b109) Tom Akehurst *2017-07-11 22:15:54*
 
**Added DSL support for specifying body file size criteria**
 
 
[d367d4d6699d3b6](https://github.com/tomakehurst/wiremock/commit/d367d4d6699d3b6) Tom Akehurst *2017-07-11 21:57:59*
 
**Started adding snapshot recording to the DSL**
 
 
[76ed3079db78efd](https://github.com/tomakehurst/wiremock/commit/76ed3079db78efd) Tom Akehurst *2017-07-11 21:11:54*
 
**Change SnapshotAcceptanceTest to use a temp file root so it test persistence**
 
 
[da6e0e721cce0e1](https://github.com/tomakehurst/wiremock/commit/da6e0e721cce0e1) Mason Malone *2017-07-11 06:18:32*
 
**More refactoring for repeated request/scenario handling**
 
 
[901db8d6ea955b8](https://github.com/tomakehurst/wiremock/commit/901db8d6ea955b8) Mason Malone *2017-07-11 05:53:35*
 
**Refactoring: move UniqueFilenameGenerator.urlToPathParts() to Urls class**
 
 
[e190c978ecb5bd1](https://github.com/tomakehurst/wiremock/commit/e190c978ecb5bd1) Mason Malone *2017-07-10 03:31:54*
 
**Some more tests for ResponseDefinitionBodyMatcher**
 
 
[0f8c6a9977994cf](https://github.com/tomakehurst/wiremock/commit/0f8c6a9977994cf) Mason Malone *2017-07-08 00:05:05*
 
**Refactoring SnapshotRepeatedRequestHandler to split up the logic**
 
 
[e6aa8ab31d7eec1](https://github.com/tomakehurst/wiremock/commit/e6aa8ab31d7eec1) Mason Malone *2017-07-08 00:04:46*
 
**Add more tests for ResponseDefinitionBodyMatcher**
 
 
[ac4692e213f7090](https://github.com/tomakehurst/wiremock/commit/ac4692e213f7090) Mason Malone *2017-07-05 22:45:51*
 
**Lots of small cleanup and refactoring**
 
 
[3a4421d463a79d4](https://github.com/tomakehurst/wiremock/commit/3a4421d463a79d4) Mason Malone *2017-07-05 21:12:50*
 
**Change output formats to return object with appropriate key instead of an array**
 
 
[fc66370a402947e](https://github.com/tomakehurst/wiremock/commit/fc66370a402947e) Mason Malone *2017-07-05 05:01:49*
 
**Lots of cleanup: move post-processing logic out of SnapshotTask and into new class and make snapshot generation a bit more functional**
 
 
[82f4f1243bc7409](https://github.com/tomakehurst/wiremock/commit/82f4f1243bc7409) Mason Malone *2017-07-05 05:01:49*
 
**Reduce some duplication in stub mapping transformer tests**
 
 
[25f17edcc63a72b](https://github.com/tomakehurst/wiremock/commit/25f17edcc63a72b) Mason Malone *2017-07-05 05:01:49*
 
**Refactoring for ServeEventRequestFilters: rename to ProxiedServeEventFilters and move proxy filtering logic over**
 
 
[7c36645fd4c6288](https://github.com/tomakehurst/wiremock/commit/7c36645fd4c6288) Mason Malone *2017-07-05 01:15:00*
 
**Cleanup to have SnapshotSpec.getCaptureHeaders() just return the capture headers**
 
 
[a47e65bda237d6d](https://github.com/tomakehurst/wiremock/commit/a47e65bda237d6d) Mason Malone *2017-07-05 00:19:47*
 
**Make all parameters final in Snapshotspec and switch JsonNode arguments to Boolean**
 
 
[331ba0a148ffd8e](https://github.com/tomakehurst/wiremock/commit/331ba0a148ffd8e) Mason Malone *2017-07-05 00:09:33*
 
**Minor fixes**
 
 
[ce49104d66970a6](https://github.com/tomakehurst/wiremock/commit/ce49104d66970a6) Mason Malone *2017-06-19 07:49:20*
 
**Work on body file extraction**
 
 
[516095a7ee151e4](https://github.com/tomakehurst/wiremock/commit/516095a7ee151e4) Mason Malone *2017-06-19 07:40:17*
 
**Moving some logic over to UniqueFilenameGenerator**
 
 
[056016f9261cb65](https://github.com/tomakehurst/wiremock/commit/056016f9261cb65) Mason Malone *2017-06-18 04:13:54*
 
**Add StubMappingTransfer extension interface and update snapshot to use it**
 
 
[44634c5f072ecc5](https://github.com/tomakehurst/wiremock/commit/44634c5f072ecc5) Mason Malone *2017-06-18 03:06:29*
 
**Remove sortFields argument to SnapshotSpec that I forgot about**
 
 
[2be25f76c087067](https://github.com/tomakehurst/wiremock/commit/2be25f76c087067) Mason Malone *2017-06-18 03:06:29*
 
**Make sure proxy server is stopped in SnapshotAcceptanceTest**
 
 
[462af43dba1162d](https://github.com/tomakehurst/wiremock/commit/462af43dba1162d) Mason Malone *2017-06-18 00:16:20*
 
**Complete refactoring for repeated request/scenario handling**
 
 
[b4f37f36efd3bba](https://github.com/tomakehurst/wiremock/commit/b4f37f36efd3bba) Mason Malone *2017-06-17 23:49:36*
 
**Don't persist stub mappings in SnapshotAcceptanceTest#returnsRequestsWithDefaultOptions()**
 
 
[43a325058e20e0d](https://github.com/tomakehurst/wiremock/commit/43a325058e20e0d) Mason Malone *2017-06-17 23:00:43*
 
**Add SnapshotAcceptanceTest, mostly with tests moved from SnapshotTaskTest**
 
 * These tests ended up uncovering a few bugs, which I&#39;ve fixed. 
 
[194b85142eeaeca](https://github.com/tomakehurst/wiremock/commit/194b85142eeaeca) Mason Malone *2017-06-17 10:15:42*
 
**Refactoring, cleanup, and adding tests**
 
 
[f68b37e6010a07f](https://github.com/tomakehurst/wiremock/commit/f68b37e6010a07f) Mason Malone *2017-06-14 07:29:08*
 
**Don't need to track name either because it's stored in the StubMapping**
 
 
[aca8eacf4f507cc](https://github.com/tomakehurst/wiremock/commit/aca8eacf4f507cc) Mason Malone *2017-06-12 06:28:11*
 
**Don't need to track every stub mapping, just the previous**
 
 
[442368c6db86222](https://github.com/tomakehurst/wiremock/commit/442368c6db86222) Mason Malone *2017-06-12 06:13:37*
 
**Relocate snapshot endpoint to /recordings/snapshot**
 
 
[ddfbf578367b5c6](https://github.com/tomakehurst/wiremock/commit/ddfbf578367b5c6) Mason Malone *2017-06-12 05:50:33*
 
**Add support for recording identical requests as a scenario**
 
 
[6eaffd841c2b11b](https://github.com/tomakehurst/wiremock/commit/6eaffd841c2b11b) Mason Malone *2017-06-12 05:46:46*
 
**Refactoring to facilitate scenario support**
 
 
[b66c1afa84fd99c](https://github.com/tomakehurst/wiremock/commit/b66c1afa84fd99c) Mason Malone *2017-06-12 05:44:04*
 
**Make output formats into an enum, which is slightly cleaner**
 
 
[403bf9f42beda43](https://github.com/tomakehurst/wiremock/commit/403bf9f42beda43) Mason Malone *2017-06-11 03:10:02*
 
**Don't generate a content-based UUID for the stub mapping, because it isn't necessary to de-dupe**
 
 
[7e49cfb21d48d77](https://github.com/tomakehurst/wiremock/commit/7e49cfb21d48d77) Mason Malone *2017-06-10 09:14:32*
 
**Make default output format for SnapshotSpec "full" for consistency with other formats**
 
 
[47f4adcacf9afb8](https://github.com/tomakehurst/wiremock/commit/47f4adcacf9afb8) Mason Malone *2017-06-10 07:50:54*
 
**Remove sorting option from SnapshotSpec, since it could be confusing**
 
 
[18d44f5af1c7a3f](https://github.com/tomakehurst/wiremock/commit/18d44f5af1c7a3f) Mason Malone *2017-06-10 07:47:14*
 
**Add ability to filter by ServeEvent ids**
 
 
[97a767f8cc834ed](https://github.com/tomakehurst/wiremock/commit/97a767f8cc834ed) Mason Malone *2017-06-10 07:42:20*
 
**Fix "persist" flag to default to true**
 
 
[3fb618be8100c88](https://github.com/tomakehurst/wiremock/commit/3fb618be8100c88) Mason Malone *2017-06-04 04:08:14*
 
 
## 2.6.0
### GitHub [#545](https://github.com/tomakehurst/wiremock/issues/545) Can we add the shutdown API command to the API Reference?    *Bug*  
 
**Add the shutdown function to the docs (#545)**
 
 
[ffda780e6cab112](https://github.com/tomakehurst/wiremock/commit/ffda780e6cab112) Jon Hinks *2016-12-12 20:25:37*
 
 
### GitHub [#598](https://github.com/tomakehurst/wiremock/issues/598) Max number of concurrent requests with fixedDelayMilliseconds    *Bug*  
 
**Fixed #598 - incorrectly documented default thread count**
 
 
[da0cf4428aa625d](https://github.com/tomakehurst/wiremock/commit/da0cf4428aa625d) Tom Akehurst *2017-04-06 14:07:26*
 
 
### GitHub [#643](https://github.com/tomakehurst/wiremock/issues/643) NullPointerException in com.github.tomakehurst.wiremock.http.ContentTypeHeader    *Bug*  
 
**#643 Prevent null pointer exception when getting MimeTypePart**
 
 
[77743d03594da1b](https://github.com/tomakehurst/wiremock/commit/77743d03594da1b) Martin Myslík *2017-04-06 11:23:28*
 
 
### No issue
 
**Added shading of Handlebars and Antlr to the build**
 
 
[08a817936df1b28](https://github.com/tomakehurst/wiremock/commit/08a817936df1b28) Tom Akehurst *2017-04-06 13:53:01*
 
**Attempt to make post serve action tests less flakey by extending timeouts. Switched away from countdown latch to async test framework code.**
 
 
[211a0e271c6b20f](https://github.com/tomakehurst/wiremock/commit/211a0e271c6b20f) Tom Akehurst *2017-04-06 13:16:33*
 
**Add response templating for proxyBaseUrl**
 
 * This extends the response templating extension to work with proxy URLs. This is very useful when 
 * using the proxy/intercept pattern with multiple different API providers, especially when the 
 * endpoints aren&#39;t known ahead of time. The browser proxy mode is perhaps better suited to this use 
 * case, but it&#39;s not an option for HTTPS-enabled APIs due to the lack of SSL support. 
 
[4fc469ed48b61fa](https://github.com/tomakehurst/wiremock/commit/4fc469ed48b61fa) Mason Malone *2017-04-02 19:03:30*
 
**Added proxyAll DSL shortcut. Improved DSL shortcuts docs and examples.**
 
 
[40e0dd03421801d](https://github.com/tomakehurst/wiremock/commit/40e0dd03421801d) Tom Akehurst *2017-03-15 09:15:03*
 
**Added DSL shortcuts for XML**
 
 
[8d0f76b95626361](https://github.com/tomakehurst/wiremock/commit/8d0f76b95626361) Tom Akehurst *2017-03-14 09:11:25*
 
**Extended timeout on post-serve action test to avoid intermittent failures in CI**
 
 
[9ec813565246257](https://github.com/tomakehurst/wiremock/commit/9ec813565246257) Tom Akehurst *2017-03-14 09:07:04*
 
**Updated external resources page on the website**
 
 
[2ea6003c35015bd](https://github.com/tomakehurst/wiremock/commit/2ea6003c35015bd) Tom Akehurst *2017-03-13 23:00:54*
 
**Fix tests broken by fixing recorded file count bug**
 
 
[10e092ac08a9292](https://github.com/tomakehurst/wiremock/commit/10e092ac08a9292) Tom Akehurst *2017-03-13 22:30:57*
 
**Fixed bug causing the same mapping to be recorded twice the first time round (stopping only after two identical requests seen).**
 
 
[bd14bd0ba1e3766](https://github.com/tomakehurst/wiremock/commit/bd14bd0ba1e3766) Tom Akehurst *2017-03-13 09:16:48*
 
**Upgrade to latest version of zjsonpatch**
 
 
[51e95249ff2c947](https://github.com/tomakehurst/wiremock/commit/51e95249ff2c947) Hans Joachim Desserud *2017-03-05 10:15:36*
 
**Bumped minor version**
 
 
[633f3cc33bc04a9](https://github.com/tomakehurst/wiremock/commit/633f3cc33bc04a9) Tom Akehurst *2017-02-01 18:52:31*
 
**Documented Java shortcuts and added status() shortcut to the DSL**
 
 
[4ed80bd192eefd7](https://github.com/tomakehurst/wiremock/commit/4ed80bd192eefd7) Tom Akehurst *2017-02-01 18:50:44*
 
**Added DSL shortcuts for common response types**
 
 
[5e3c4b0c7746d7f](https://github.com/tomakehurst/wiremock/commit/5e3c4b0c7746d7f) Tom Akehurst *2017-01-10 09:20:16*
 
 
## 2.5.1
### GitHub [#552](https://github.com/tomakehurst/wiremock/issues/552) ClasspathFileSource Exception from space in jar path    *Bug*  
 
**Fixed #552 - ClasspathFileSource now supports spaces in paths to zip/jar/war/ear files**
 
 
[2c7166ef6d92dd5](https://github.com/tomakehurst/wiremock/commit/2c7166ef6d92dd5) Tom Akehurst *2017-01-23 19:41:48*
 
 
### GitHub [#571](https://github.com/tomakehurst/wiremock/issues/571) Query parameter values are double decoded in Urls helper class  
 
**Fixed #571 - when converting an escaped URL query to a logged request field it no longer attempts (and fails) to URL escape the values twice**
 
 
[07f8834eb562748](https://github.com/tomakehurst/wiremock/commit/07f8834eb562748) Tom Akehurst *2017-01-12 19:13:34*
 
 
### GitHub [#580](https://github.com/tomakehurst/wiremock/issues/580) IllegalStateException in MatchesJsonPathPattern.toString()    *Bug*  
 
**Fixed #580 - added missing @JsonProperty annotation onto matcher and added a reflective test to ensure future matchers have this**
 
 
[593c34600597faa](https://github.com/tomakehurst/wiremock/commit/593c34600597faa) Tom Akehurst *2017-01-23 09:36:52*
 
 
### GitHub [#585](https://github.com/tomakehurst/wiremock/issues/585) Extending PostServeAction questions    *Bug*  
 
**Fixed #585 - response is now provided to post serve actions (was previously null)**
 
 
[eb44a6010023e5a](https://github.com/tomakehurst/wiremock/commit/eb44a6010023e5a) Tom Akehurst *2017-01-21 17:40:45*
 
 
### GitHub [#587](https://github.com/tomakehurst/wiremock/issues/587) Inaccurate timestamps in AdminRequestHandler logs    *Bug*  
 
**Fixed #587 - ConsoleNotifier now renders dates with padded milliseconds for consistency with other log output and ease of parsing**
 
 
[7d8a488008dadb7](https://github.com/tomakehurst/wiremock/commit/7d8a488008dadb7) Tom Akehurst *2017-01-28 21:40:04*
 
 
### GitHub [#593](https://github.com/tomakehurst/wiremock/issues/593) ResponseTemplateTransformer and withBodyFile (v2.5.0)    *Bug*  
 
**Fixed #593 - now applies response templates to body files**
 
 
[12a362f6c717a5b](https://github.com/tomakehurst/wiremock/commit/12a362f6c717a5b) Tom Akehurst *2017-01-28 20:51:12*
 
 
### No issue
 
**Deleted redundant test class**
 
 
[6910787e403d57a](https://github.com/tomakehurst/wiremock/commit/6910787e403d57a) Tom Akehurst *2017-01-28 21:45:42*
 
**Bumped patch version**
 
 
[d13605c2256d877](https://github.com/tomakehurst/wiremock/commit/d13605c2256d877) Tom Akehurst *2017-01-28 20:52:00*
 
**Further test race condition fixes**
 
 
[062d2cfa3ec0a19](https://github.com/tomakehurst/wiremock/commit/062d2cfa3ec0a19) Tom Akehurst *2017-01-21 19:42:05*
 
**Fixed flakey test for presence of response in post serve action extension**
 
 
[2e5ac644187c9f8](https://github.com/tomakehurst/wiremock/commit/2e5ac644187c9f8) Tom Akehurst *2017-01-21 17:54:44*
 
**fixing docs, the code did not compile because the method has been rename a while back**
 
 
[4aae11db8fb2d21](https://github.com/tomakehurst/wiremock/commit/4aae11db8fb2d21) Wojciech Bulaty *2017-01-19 12:53:27*
 
**Options.httpServerFactory() already allows for defining ones own HttpServer, but you have to write one from scratch. It would be convenient if one could just override bits of JettyHttpServer and reuse the rest of already existing code in Wiremock. In order to do that I have made JettyHttpServer opened to extension  by making the class public and some of the methods protected so that they can be overridden in a subclass.**
 
 
[9fef98e13babc11](https://github.com/tomakehurst/wiremock/commit/9fef98e13babc11) Wojciech Bulaty *2017-01-18 13:59:25*
 
**ignore classes directory**
 
 
[d6527478baf3acd](https://github.com/tomakehurst/wiremock/commit/d6527478baf3acd) Wojciech Bulaty *2017-01-14 14:30:53*
 
**Asserts that Transfer-Encoding is absent when Content-Length header sent in test case**
 
 
[0a34aa8ebef608e](https://github.com/tomakehurst/wiremock/commit/0a34aa8ebef608e) Tom Akehurst *2017-01-12 18:51:38*
 
**documenting existing behaviour when Content-Length or Transfer-Encoding will be returned**
 
 
[3b5cf0ee023d0d0](https://github.com/tomakehurst/wiremock/commit/3b5cf0ee023d0d0) Wojciech Bulaty *2016-12-15 21:36:00*
 
 
## 2.5.0
### GitHub [#539](https://github.com/tomakehurst/wiremock/issues/539) Unable to bind IP addresses for https    *Bug*  
 
**Fix #539 - bind HTTPS to a specific host if required**
 
 
[bfb5bbed81cb6d4](https://github.com/tomakehurst/wiremock/commit/bfb5bbed81cb6d4) Tom Akehurst *2017-01-06 17:52:52*
 
 
### No issue
 
**Made ClasspathFileSource fail silently when attempting writes so that it doesn't cause errors when all stubs are deleted**
 
 
[c7597a766aaad79](https://github.com/tomakehurst/wiremock/commit/c7597a766aaad79) Tom Akehurst *2017-01-05 19:03:21*
 
**Added ability to name stub mappings**
 
 
[42b567633ae370e](https://github.com/tomakehurst/wiremock/commit/42b567633ae370e) Tom Akehurst *2017-01-05 18:47:42*
 
**WIP**
 
 
[b414180b172ba49](https://github.com/tomakehurst/wiremock/commit/b414180b172ba49) Tom Akehurst *2017-01-05 09:28:33*
 
**Workaround for IllegalArgumentException("resource assets not found.") when starting the server on Android**
 
 
[23b017eae86f8c0](https://github.com/tomakehurst/wiremock/commit/23b017eae86f8c0) soggier *2016-12-31 15:33:31*
 
**Added and documented using custom helpers with templated responses**
 
 
[a59cb616e10a993](https://github.com/tomakehurst/wiremock/commit/a59cb616e10a993) Tom Akehurst *2016-12-21 21:11:31*
 
**Documented response templating**
 
 
[c1f26b583691618](https://github.com/tomakehurst/wiremock/commit/c1f26b583691618) Tom Akehurst *2016-12-21 20:46:46*
 
**Added command line toggles for local and global response templating**
 
 
[5d73651cfd9ba76](https://github.com/tomakehurst/wiremock/commit/5d73651cfd9ba76) Tom Akehurst *2016-12-21 18:41:26*
 
**Added response template extension acceptance tests. Renamed classes for consistency.**
 
 
[0bc15833906f5c1](https://github.com/tomakehurst/wiremock/commit/0bc15833906f5c1) Tom Akehurst *2016-12-21 09:32:51*
 
**Added interpolation of individual URL path nodes by index**
 
 
[2e50f4d5ca7cd94](https://github.com/tomakehurst/wiremock/commit/2e50f4d5ca7cd94) Tom Akehurst *2016-12-19 18:31:00*
 
**Added header, cookie and URL interpolation. Added response header templating.**
 
 
[ad2ed2daaf659b5](https://github.com/tomakehurst/wiremock/commit/ad2ed2daaf659b5) Tom Akehurst *2016-12-19 18:18:54*
 
**Remove unused imports**
 
 
[73afdec1d211b83](https://github.com/tomakehurst/wiremock/commit/73afdec1d211b83) Hans Joachim Desserud *2016-12-15 19:21:13*
 
**Added query parameter interpolation into the response body**
 
 
[bdd6ffb5c1c209e](https://github.com/tomakehurst/wiremock/commit/bdd6ffb5c1c209e) Tom Akehurst *2016-12-15 09:36:46*
 
**When the XML DTD points to an unknown hostname then XMLUnit will get an UnknownHostException which results in a failed match. A fix for this was to disable fetching DTDs.**
 
 
[02b0c6a26a37720](https://github.com/tomakehurst/wiremock/commit/02b0c6a26a37720) Wojciech Bulaty *2016-12-14 21:11:47*
 
 
## 2.4.1
### GitHub [#474](https://github.com/tomakehurst/wiremock/issues/474) HTTP ERROR: 500 in Proxy mode    *Bug*  
 
**Fixed #474 - bug with file extension detection when dots exist in the URL path**
 
 
[beaf5b2c0e293b7](https://github.com/tomakehurst/wiremock/commit/beaf5b2c0e293b7) Tom Akehurst *2016-11-23 23:17:08*
 
 
### GitHub [#521](https://github.com/tomakehurst/wiremock/issues/521) ResponseDefinitionBuilder.like() doesn&#39;t keep original transformer parameters    *Bug*  
 
**Fixed #521 = fields not copied in ResponseDefinitionBuilder.like()**
 
 
[977a00ec02a1785](https://github.com/tomakehurst/wiremock/commit/977a00ec02a1785) Tom Akehurst *2016-11-17 15:47:31*
 
 
### GitHub [#527](https://github.com/tomakehurst/wiremock/issues/527) urlPathEqualTo decodes the path before matching, urlEqualTo does not  
 
**use URI.rawPath() for url path matching - issue #527**
 
 
[2521a82b9d29b27](https://github.com/tomakehurst/wiremock/commit/2521a82b9d29b27) Florian Lasinger *2016-11-07 10:37:12*
 
 
### GitHub [#531](https://github.com/tomakehurst/wiremock/issues/531) Basic auth header matching shouldn&#39;t be case sensitive    *Bug*  
 
**Fixed #531 - basic auth not matching due to case-sensitive matching of the Basic part**
 
 
[4b308da0f1f5c91](https://github.com/tomakehurst/wiremock/commit/4b308da0f1f5c91) Tom Akehurst *2016-11-18 10:17:16*
 
 
### GitHub [#532](https://github.com/tomakehurst/wiremock/issues/532) Exception should be thrown when attempting remote verification with a custom matcher    *Bug*  
 
**Fixed #532 - now supports verification with a custom matcher against a remote server**
 
 
[07bf2af9cd3a4ec](https://github.com/tomakehurst/wiremock/commit/07bf2af9cd3a4ec) Tom Akehurst *2016-11-23 23:17:08*
 
 
### GitHub [#534](https://github.com/tomakehurst/wiremock/issues/534) Deprecate Optional&lt;&gt; in request journal limit param    *Feature request*  
 
**Fixed #534. Deprecated max request journal entries config setting taking Optional in the parameter and replaced with an int.**
 
 
[53b9642b7283d82](https://github.com/tomakehurst/wiremock/commit/53b9642b7283d82) Tom Akehurst *2016-11-23 23:17:08*
 
 
### No issue
 
**Bumped minor version**
 
 
[9aba5113224e872](https://github.com/tomakehurst/wiremock/commit/9aba5113224e872) Tom Akehurst *2016-11-25 15:38:57*
 
**Factored out duplication in verification logic**
 
 
[0ef9fada93aced4](https://github.com/tomakehurst/wiremock/commit/0ef9fada93aced4) Tom Akehurst *2016-11-23 23:17:08*
 
**adding silent error handler to DocumentBuilder to suppress Fatal Error logging**
 
 
[635e07ecee43154](https://github.com/tomakehurst/wiremock/commit/635e07ecee43154) senpay *2016-11-23 10:04:31*
 
**Fixed NPE bug exposed by fixing ResponseDefinitionBuilder.like()**
 
 
[dc6f17374758d40](https://github.com/tomakehurst/wiremock/commit/dc6f17374758d40) Tom Akehurst *2016-11-17 16:22:55*
 
**Added a remote loader, allowing a filesystem full of mappings to be loaded into a remotely running WireMock instance**
 
 
[5d4e149422ffba0](https://github.com/tomakehurst/wiremock/commit/5d4e149422ffba0) Tom Akehurst *2016-11-17 15:47:30*
 
**corrected a minor typo**
 
 * result.wasSuccessFul -&gt; result.wasSuccessful 
 
[a1ef8efebd70225](https://github.com/tomakehurst/wiremock/commit/a1ef8efebd70225) Heinz Karsten Hiekmann *2016-11-12 18:15:01*
 
**Renamed deleteMappings to removeMappings and their static equivalents for consistency**
 
 
[504d6d196c3a41f](https://github.com/tomakehurst/wiremock/commit/504d6d196c3a41f) Tom Akehurst *2016-11-09 16:11:32*
 
**Added support for deleting mappings from the persistent store when all mapping are removed. Switched reset behaviour to reset to default i.e. re-load from the persistent store.**
 
 
[5abdbae641ecd63](https://github.com/tomakehurst/wiremock/commit/5abdbae641ecd63) Tom Akehurst *2016-11-09 15:48:50*
 
**Exposed the ObjectMapper in Json and switched to contructing its thread local holder in a more idiomatic way.**
 
 
[b6917b3a424f60c](https://github.com/tomakehurst/wiremock/commit/b6917b3a424f60c) Tom Akehurst *2016-11-07 17:13:31*
 
**More admin API JSON schema improvements**
 
 
[18db16755e44daa](https://github.com/tomakehurst/wiremock/commit/18db16755e44daa) Tom Akehurst *2016-11-04 14:58:16*
 
**Improved response definition JSON schema**
 
 
[f487f7ae7b0becb](https://github.com/tomakehurst/wiremock/commit/f487f7ae7b0becb) Tom Akehurst *2016-11-04 12:52:50*
 
**Bumped version**
 
 
[ab8002b8dd6851b](https://github.com/tomakehurst/wiremock/commit/ab8002b8dd6851b) Tom Akehurst *2016-11-04 12:02:00*
 
**Added RAML doc to bump-version gradle task**
 
 
[513aef13710266e](https://github.com/tomakehurst/wiremock/commit/513aef13710266e) Tom Akehurst *2016-11-04 12:01:26*
 
**Added missing script accidentally ignored**
 
 
[d182139dd37c21e](https://github.com/tomakehurst/wiremock/commit/d182139dd37c21e) Tom Akehurst *2016-11-03 17:20:45*
 
 
## 2.3.1
### GitHub [#507](https://github.com/tomakehurst/wiremock/issues/507) Add documentation for customizing the response of all unmapped requests  
 
**Customizing default response for unknown stubs - issue #507**
 
 
[50b68b0505d40a2](https://github.com/tomakehurst/wiremock/commit/50b68b0505d40a2) Michael Vogiatzis *2016-10-06 16:29:41*
 
 
### GitHub [#517](https://github.com/tomakehurst/wiremock/issues/517) Custom Request Matcher NPE when unmatched    *Bug*  
 
**Fixed #517 - NPE when rendering a diff involving a request pattern with a custom matcher**
 
 
[629d95aaf6e95c9](https://github.com/tomakehurst/wiremock/commit/629d95aaf6e95c9) Tom Akehurst *2016-10-25 19:07:37*
 
 
### No issue
 
**Added a doc note pointing to the embedded Swagger + RAML specs**
 
 
[33fd9591f073e0c](https://github.com/tomakehurst/wiremock/commit/33fd9591f073e0c) Tom Akehurst *2016-11-03 17:12:56*
 
**Added generated API docs to site and Swagger + Swagger UI + RAML docs to WireMock**
 
 
[e283d6399c9b4da](https://github.com/tomakehurst/wiremock/commit/e283d6399c9b4da) Tom Akehurst *2016-11-03 17:05:10*
 
**Attempt to pin node version in the travis config**
 
 
[a27b62798048c28](https://github.com/tomakehurst/wiremock/commit/a27b62798048c28) Tom Akehurst *2016-11-03 08:27:08*
 
**Added npm install pre-step to generate docs to avoid the build failing when node_modules isn't already there**
 
 
[6dd93e2ab89be83](https://github.com/tomakehurst/wiremock/commit/6dd93e2ab89be83) Tom Akehurst *2016-11-02 19:27:57*
 
**Added RAML specification for the admin API, HTML rendering of the spec, translation to Swagger and Swagger UI served from the admin interface.**
 
 
[1c9f173bf27f1b5](https://github.com/tomakehurst/wiremock/commit/1c9f173bf27f1b5) Tom Akehurst *2016-11-02 19:20:33*
 
**Added RAML documentation for the admin API**
 
 
[dcb5044550b35df](https://github.com/tomakehurst/wiremock/commit/dcb5044550b35df) Tom Akehurst *2016-11-02 12:58:57*
 
**Updated custom matching doc**
 
 
[0b4e11f5421d8be](https://github.com/tomakehurst/wiremock/commit/0b4e11f5421d8be) Tom Akehurst *2016-11-01 13:23:31*
 
**Fixed Java 8 lambda compatibility for custom request matchers**
 
 
[d088e079bee92f3](https://github.com/tomakehurst/wiremock/commit/d088e079bee92f3) Tom Akehurst *2016-11-01 13:23:17*
 
**Bumped minor version**
 
 
[1a44e279e1ff07d](https://github.com/tomakehurst/wiremock/commit/1a44e279e1ff07d) Tom Akehurst *2016-10-25 18:38:55*
 
**Added support for immediately persisting stub edits and deletes**
 
 
[44c25e422f9970c](https://github.com/tomakehurst/wiremock/commit/44c25e422f9970c) Tom Akehurst *2016-10-25 18:35:56*
 
**Refactored save mappings code for additional clarity. Added a single save method.**
 
 
[e69a5833d08dc3a](https://github.com/tomakehurst/wiremock/commit/e69a5833d08dc3a) Tom Akehurst *2016-10-25 17:25:40*
 
**Created an acceptance test for stub persistence. Fixed bug preventing edited files saving back to the same file that created them.**
 
 
[b105792a3188a83](https://github.com/tomakehurst/wiremock/commit/b105792a3188a83) Tom Akehurst *2016-10-25 17:17:44*
 
**Added Bas' workshop link to the external resources page**
 
 
[737c7a7c4e22ddb](https://github.com/tomakehurst/wiremock/commit/737c7a7c4e22ddb) Tom Akehurst *2016-10-19 16:23:50*
 
**Changed method GET to ANY when stubbing for unmapped requests**
 
 
[457ce79ae558974](https://github.com/tomakehurst/wiremock/commit/457ce79ae558974) Michael Vogiatzis *2016-10-07 09:16:58*
 
**Update simulating-faults.md**
 
 
[9331cba17d00dbc](https://github.com/tomakehurst/wiremock/commit/9331cba17d00dbc) Michael Vogiatzis *2016-10-06 16:34:16*
 
**Replaced .* with anyUrl()**
 
 
[dbb9707e754f522](https://github.com/tomakehurst/wiremock/commit/dbb9707e754f522) Michael Vogiatzis *2016-10-06 16:31:50*
 
**Documentation on how to customize default 404 response for unmapped requests**
 
 
[40c700a9c394fba](https://github.com/tomakehurst/wiremock/commit/40c700a9c394fba) Michael Vogiatzis *2016-10-06 16:03:27*
 
 
## 2.2.2
### No issue
 
**Edit stub mapping API call now returns the updated JSON, for consistency with create**
 
 
[e5ef7f6ce2b6bbb](https://github.com/tomakehurst/wiremock/commit/e5ef7f6ce2b6bbb) Tom Akehurst *2016-10-19 14:45:08*
 
**Bumped version**
 
 
[39d866ba97df3d7](https://github.com/tomakehurst/wiremock/commit/39d866ba97df3d7) Tom Akehurst *2016-10-19 14:38:44*
 
 
## 2.2.1
### GitHub [#285](https://github.com/tomakehurst/wiremock/issues/285) Wiremock misleadingly tells it failed to communicate with admin endpoint  
 
**Fix: #285 - WireMockRule tries to contact server on near miss**
 
 
[4d1ef8917d85a35](https://github.com/tomakehurst/wiremock/commit/4d1ef8917d85a35) Magnus Reftel *2016-08-17 18:51:33*
 
 
### GitHub [#457](https://github.com/tomakehurst/wiremock/issues/457) Using Wiremock 2.x from Scala  
 
**Restore scala compat. in MappingBuilder types**
 
 * Removes entire concept of different local and remote napping builders 
 * on the basis that it was too complex for the gain in compile time type safety. 
 * Fixes scala compatibility issue. 
 * Resolves: #457 
 
[dc1fd8f6681c82b](https://github.com/tomakehurst/wiremock/commit/dc1fd8f6681c82b) Robert *2016-08-16 15:39:03*
 
 
### GitHub [#501](https://github.com/tomakehurst/wiremock/issues/501) RequestPattern breaks  hashCode contract    *Bug*  
 
**Fixed #501 - equals and hashCode contract violations**
 
 
[01da84515dce5d3](https://github.com/tomakehurst/wiremock/commit/01da84515dce5d3) Tom Akehurst *2016-10-03 18:52:18*
 
 
### Jira length-1   
 
**Bump JsonPath to 2.0.0 to 2.2.0**
 
 * Breaking change: $..book[(@.length-1)] doesn&#39;t work anymore 
 
[37a098c1c539b34](https://github.com/tomakehurst/wiremock/commit/37a098c1c539b34) AlixBa *2016-09-15 08:11:08*
 
 
### No issue
 
**Factored out an Options implementation for WAR deployment**
 
 
[27aed5c4feffb20](https://github.com/tomakehurst/wiremock/commit/27aed5c4feffb20) Tom Akehurst *2016-10-04 21:19:41*
 
**Move request handlers inside WireMockApp and construct WireMockApp by passing Options rather than individual elements.**
 
 
[47dfffd63d5c77b](https://github.com/tomakehurst/wiremock/commit/47dfffd63d5c77b) Tom Akehurst *2016-10-04 18:53:33*
 
**InMemoryRequestJournal is no longer a request listener. This was misleading as it was no longer being called via this interface.**
 
 
[2bc481d32ef7f73](https://github.com/tomakehurst/wiremock/commit/2bc481d32ef7f73) Tom Akehurst *2016-10-04 18:30:44*
 
**Omit transformers and transformerParameters from response definition JSON when empty**
 
 
[dcc6c3bf8c82ab2](https://github.com/tomakehurst/wiremock/commit/dcc6c3bf8c82ab2) Tom Akehurst *2016-10-03 18:08:22*
 
**Added defaulting of request and response under stub mappings such that it's possible to POST an empty JSON document and create a valid mapping. Also now supports omitting the response in the DSL and the end result still being valid.**
 
 
[38ed482f0d8781f](https://github.com/tomakehurst/wiremock/commit/38ed482f0d8781f) Tom Akehurst *2016-10-03 17:51:28*
 
**Removed some dead code**
 
 
[01df6abb9c011f0](https://github.com/tomakehurst/wiremock/commit/01df6abb9c011f0) Tom Akehurst *2016-10-03 16:03:47*
 
**Removed some redundant JUnit rule tests and combined relevant ones into the existing JUnit rule test classes**
 
 
[92ca2c95131a55c](https://github.com/tomakehurst/wiremock/commit/92ca2c95131a55c) Tom Akehurst *2016-10-03 16:00:35*
 
**Added docs for post serve action and admin API extensions**
 
 
[41b67dd18260bdb](https://github.com/tomakehurst/wiremock/commit/41b67dd18260bdb) Tom Akehurst *2016-10-03 15:17:18*
 
**Added a post serve action extension point. Added an admin API extension point.**
 
 
[e245d612756fb62](https://github.com/tomakehurst/wiremock/commit/e245d612756fb62) Tom Akehurst *2016-10-03 14:56:15*
 
**Set version to 2.2.1**
 
 
[13eaf881f6b98d8](https://github.com/tomakehurst/wiremock/commit/13eaf881f6b98d8) Tom Akehurst *2016-10-03 14:09:50*
 
**Deleted legacy docs directory**
 
 
[4791d477463de9e](https://github.com/tomakehurst/wiremock/commit/4791d477463de9e) Tom Akehurst *2016-10-03 14:07:45*
 
**Added documentation for paginated stub mappings and requests APIs. Added remove stub mapping by ID to Java DSL. Added Java DSL call for getting a single stub mapping and documented.**
 
 
[f334e9a1e23f0a3](https://github.com/tomakehurst/wiremock/commit/f334e9a1e23f0a3) Tom Akehurst *2016-10-03 14:07:00*
 
**Renamed a poorly named method in RequestJournal**
 
 
[02540825e5b3f5e](https://github.com/tomakehurst/wiremock/commit/02540825e5b3f5e) Tom Akehurst *2016-10-03 10:54:38*
 
**Removed DELETE based scenario reset API route as this wasn't really a RESTful resource. Updated docs to reflect new admin API style.**
 
 
[af56258aaccc721](https://github.com/tomakehurst/wiremock/commit/af56258aaccc721) Tom Akehurst *2016-10-03 10:48:01*
 
**Update gradle version in wrapper task**
 
 
[294821ac0d517cc](https://github.com/tomakehurst/wiremock/commit/294821ac0d517cc) rhart *2016-09-29 08:44:27*
 
**Upgrade to gradle 3.1**
 
 
[23a0a7d8c051d46](https://github.com/tomakehurst/wiremock/commit/23a0a7d8c051d46) rhart *2016-09-28 17:04:41*
 
**Adding verification method for any HTTP method**
 
 
[1f74e15be60b755](https://github.com/tomakehurst/wiremock/commit/1f74e15be60b755) Andrew Shore *2016-09-20 02:46:24*
 
**add example in docs**
 
 
[69280358678b035](https://github.com/tomakehurst/wiremock/commit/69280358678b035) AlixBa *2016-09-15 11:19:13*
 
**Added wasMatched property to ServeEvent, calculcated from wasConfigured in the response definition. Done because the fromConfiguredStub field in the response definition JSON is null when true, meaning more logic is needed in the consumer.**
 
 
[0d691be2c4ee8ae](https://github.com/tomakehurst/wiremock/commit/0d691be2c4ee8ae) Tom Akehurst *2016-09-14 08:19:47*
 
**API DELETE routes now return empty JSON responses**
 
 
[05090399d640a45](https://github.com/tomakehurst/wiremock/commit/05090399d640a45) Tom Akehurst *2016-09-13 17:13:16*
 
**Added scenario reset via HTTP DELETE**
 
 
[a3a6a06ed646bcd](https://github.com/tomakehurst/wiremock/commit/a3a6a06ed646bcd) Tom Akehurst *2016-09-12 08:20:17*
 
**Removed old version of CORS support, which was breaking the new by adding a duplicate header**
 
 
[0bb7d842955c313](https://github.com/tomakehurst/wiremock/commit/0bb7d842955c313) Tom Akehurst *2016-09-09 20:07:38*
 
**Fixed bug in remove stub mapping over HTTP. Added some extra tests around editing and removing stub mappings via the DSL.**
 
 
[502ef8a754129c3](https://github.com/tomakehurst/wiremock/commit/502ef8a754129c3) Tom Akehurst *2016-09-07 09:20:05*
 
**Request journal can now be reset via a DELETE to /__admin/requests.**
 
 
[50bb21f5a1056aa](https://github.com/tomakehurst/wiremock/commit/50bb21f5a1056aa) Tom Akehurst *2016-09-07 09:05:37*
 
**Added a new reset mappings API via HTTP DELETE (that exclusively resets mappings, not request journal).**
 
 
[4322f511712dbbb](https://github.com/tomakehurst/wiremock/commit/4322f511712dbbb) Tom Akehurst *2016-09-05 13:41:50*
 
**Remove support and training from top nav in docs**
 
 
[4a41a18868412a2](https://github.com/tomakehurst/wiremock/commit/4a41a18868412a2) Tom Akehurst *2016-09-05 08:10:05*
 
**Added application/json content type header to new stub mapping response**
 
 
[5e943125fafaf70](https://github.com/tomakehurst/wiremock/commit/5e943125fafaf70) Tom Akehurst *2016-09-02 19:15:14*
 
**Now returns the JSON for a newly created stub from the API**
 
 
[32a39557458996d](https://github.com/tomakehurst/wiremock/commit/32a39557458996d) Tom Akehurst *2016-09-02 19:08:15*
 
**Renamed 'ServedStubs' to 'ServeEvents'. Renamed logged requests wrapper element in the API to 'requests'.**
 
 
[de7f1f95fb99bd6](https://github.com/tomakehurst/wiremock/commit/de7f1f95fb99bd6) Tom Akehurst *2016-09-02 18:21:02*
 
**Renamed deprecated task with Old prefix**
 
 
[0b2609006f45409](https://github.com/tomakehurst/wiremock/commit/0b2609006f45409) Tom Akehurst *2016-09-02 18:10:37*
 
**Bumped version**
 
 
[3b4663b57bfdb4e](https://github.com/tomakehurst/wiremock/commit/3b4663b57bfdb4e) Tom Akehurst *2016-09-02 11:13:57*
 
**Added PUT-based edit stub mapping API route**
 
 
[c95781eed919e6d](https://github.com/tomakehurst/wiremock/commit/c95781eed919e6d) Tom Akehurst *2016-09-02 11:09:44*
 
**Added remove stub by ID API task**
 
 
[2f43ab1f924d038](https://github.com/tomakehurst/wiremock/commit/2f43ab1f924d038) Tom Akehurst *2016-09-02 10:48:27*
 
**Fixed tests broken by the addition of surrogate ID to stub mappings**
 
 
[0255d06aaf4f4b5](https://github.com/tomakehurst/wiremock/commit/0255d06aaf4f4b5) Tom Akehurst *2016-08-25 12:16:38*
 
**Stub mapping creation now returns the stub mapping object and ensures it is given an ID. Also added an id alias for the uuid field for consistency.**
 
 
[89bb7511fbb657d](https://github.com/tomakehurst/wiremock/commit/89bb7511fbb657d) Tom Akehurst *2016-08-25 12:09:11*
 
**Add tests for JUnit rule**
 
 
[c024f05f01d695b](https://github.com/tomakehurst/wiremock/commit/c024f05f01d695b) Magnus Reftel *2016-08-17 18:51:33*
 
**Removed local interface for verification. Like stubbing this has now reverted to a single interface for local and remote interaction with the API.**
 
 
[d75dbfa2acb7d9d](https://github.com/tomakehurst/wiremock/commit/d75dbfa2acb7d9d) Tom Akehurst *2016-08-17 15:27:37*
 
**Configured build to allow local releases**
 
 
[506256f8b2512b8](https://github.com/tomakehurst/wiremock/commit/506256f8b2512b8) Tom Akehurst *2016-08-17 12:17:00*
 
**Added copyright headers**
 
 
[ff90cbb119a198f](https://github.com/tomakehurst/wiremock/commit/ff90cbb119a198f) Tom Akehurst *2016-08-17 11:50:56*
 
**Added single served stub admin API resource.**
 
 
[24aac27176bbcff](https://github.com/tomakehurst/wiremock/commit/24aac27176bbcff) Tom Akehurst *2016-08-17 11:47:29*
 
**Added single stub mapping API resource.**
 
 
[08d559daf0e69c5](https://github.com/tomakehurst/wiremock/commit/08d559daf0e69c5) Tom Akehurst *2016-08-16 21:49:44*
 
**Added new served stubs resource to the API with pagination by date and offset.**
 
 
[329c868b6752228](https://github.com/tomakehurst/wiremock/commit/329c868b6752228) Tom Akehurst *2016-08-16 19:42:47*
 
**Removed some dead code from Response**
 
 
[60c778fd4d0e02d](https://github.com/tomakehurst/wiremock/commit/60c778fd4d0e02d) Tom Akehurst *2016-08-16 14:44:15*
 
**Refactored admin routes to make an instance, rather than static. Added a new all mappings resource with pagination.**
 
 
[72e1de2bfd57a38](https://github.com/tomakehurst/wiremock/commit/72e1de2bfd57a38) Tom Akehurst *2016-08-16 14:32:30*
 
 
## 2.1.12
### GitHub [#489](https://github.com/tomakehurst/wiremock/issues/489) Distance calculation is having an impact on performance    *Bug*  
 
**Fixed #489 - performance bug caused by distance calculation happening on each equality match, whether or not near misses were calculated. Switched to a lazy MatchResult.**
 
 
[ea62ba417a59a15](https://github.com/tomakehurst/wiremock/commit/ea62ba417a59a15) Tom Akehurst *2016-09-06 10:12:58*
 
 
### GitHub [#493](https://github.com/tomakehurst/wiremock/pull/493) Xpath matcher fix  
 
**Fixes #493. Removed shading from joptsimple as it breaks help text rendering due to not being able to load a property bundle.**
 
 
[75528a72f9c9fcc](https://github.com/tomakehurst/wiremock/commit/75528a72f9c9fcc) Tom Akehurst *2016-08-31 14:23:38*
 
 
### No issue
 
**Bumped version**
 
 
[10183c6b1917dea](https://github.com/tomakehurst/wiremock/commit/10183c6b1917dea) Tom Akehurst *2016-09-06 10:16:46*
 
**Added support for cross origin requests to the admin API**
 
 
[ca4d51176c2c38e](https://github.com/tomakehurst/wiremock/commit/ca4d51176c2c38e) Tom Akehurst *2016-09-05 14:25:54*
 
**Fixed absent cookie matching bug. Added null safety to some matchers.**
 
 
[6a072e180a53818](https://github.com/tomakehurst/wiremock/commit/6a072e180a53818) Tom Akehurst *2016-08-31 14:59:38*
 
 
## 2.1.11
### No issue
 
**Bumped version**
 
 
[c93260819c0aaeb](https://github.com/tomakehurst/wiremock/commit/c93260819c0aaeb) Tom Akehurst *2016-08-18 08:47:52*
 
 
## 2.1.10
### GitHub [#477](https://github.com/tomakehurst/wiremock/issues/477) com.github.tomakehurst.wiremock.verification.Diff.formatIfJsonOrXml bug    *Bug*  
 
**Fixed #477 - exception when attempting to verify with equalToXml when the request body does not contain valid XML.**
 
 
[f2cb2f19a1368f5](https://github.com/tomakehurst/wiremock/commit/f2cb2f19a1368f5) Tom Akehurst *2016-08-11 09:52:32*
 
 
### No issue
 
**Bumped version**
 
 
[971b375d254a1ca](https://github.com/tomakehurst/wiremock/commit/971b375d254a1ca) Tom Akehurst *2016-08-11 09:53:14*
 
 
## 2.1.9
### GitHub [#473](https://github.com/tomakehurst/wiremock/issues/473) Wrong Content Returned in Parallel Proxied Requests on 2.x    *Bug*  
 
**Fixed #473 - proxied responses getting crossed on the wire**
 
 
[6788bc2e1ef91c2](https://github.com/tomakehurst/wiremock/commit/6788bc2e1ef91c2) Tom Akehurst *2016-07-28 20:55:17*
 
 
### No issue
 
**Bumped version. Added copyright header.**
 
 
[940794dd8c4a6eb](https://github.com/tomakehurst/wiremock/commit/940794dd8c4a6eb) Tom Akehurst *2016-07-28 20:57:35*
 
 
## 2.1.8
### GitHub [#461](https://github.com/tomakehurst/wiremock/issues/461) Standalone does not appear to be saving responses - colon present in request URL - Fix suggested  
 
**Fixed #461. Now sanitises file names when recording.**
 
 
[6227a712755a70c](https://github.com/tomakehurst/wiremock/commit/6227a712755a70c) Tom Akehurst *2016-07-27 09:56:15*
 
 
### No issue
 
**Updated gen-docs.sh for docs-v2**
 
 
[e3f4faa4b6e0937](https://github.com/tomakehurst/wiremock/commit/e3f4faa4b6e0937) Tom Akehurst *2016-07-27 12:56:17*
 
**Bumped version**
 
 
[dd45ac424de7a0d](https://github.com/tomakehurst/wiremock/commit/dd45ac424de7a0d) Tom Akehurst *2016-07-27 12:51:44*
 
**Added missing copyright headers**
 
 
[7f29bd2b0926227](https://github.com/tomakehurst/wiremock/commit/7f29bd2b0926227) Tom Akehurst *2016-07-27 12:50:53*
 
**Fixed bug with like() method in ResponseDefinitionTransformer where delay distribution wasn't being copied over to the new builder**
 
 
[83c2c01b6beafb2](https://github.com/tomakehurst/wiremock/commit/83c2c01b6beafb2) Tom Akehurst *2016-07-27 12:42:08*
 
**Fixed empty header issue. Sending an empty header value now no longer triggers a 500 response.**
 
 
[3ba037ce9b8af31](https://github.com/tomakehurst/wiremock/commit/3ba037ce9b8af31) Tom Akehurst *2016-07-27 09:27:56*
 
**Update request-matching.md**
 
 * Added escape of &#39;?&#39; character (&#39;\\&#39;) for regex matching on path and query. 
 
[e14e267f1a6f326](https://github.com/tomakehurst/wiremock/commit/e14e267f1a6f326) Blake Norrish *2016-07-26 18:23:31*
 
**Recorder now detects file type and assigns body file extension appropriately**
 
 
[f3c16b63f24f9fa](https://github.com/tomakehurst/wiremock/commit/f3c16b63f24f9fa) Tom Akehurst *2016-07-24 23:40:51*
 
**Shaded some additional library packages**
 
 
[961e91bb1b2aaf9](https://github.com/tomakehurst/wiremock/commit/961e91bb1b2aaf9) Tom Akehurst *2016-07-24 21:46:27*
 
 
## 2.1.7
### GitHub [#458](https://github.com/tomakehurst/wiremock/issues/458) NullPointerException when using JUnit rule with custom matcher  
 
**Fix #458 - NPE thrown when using custom matchers and near misses**
 
 
[dd750bcb0835910](https://github.com/tomakehurst/wiremock/commit/dd750bcb0835910) Tom Akehurst *2016-07-11 20:22:58*
 
 
### No issue
 
**Bumped version**
 
 
[a48315b54587fa6](https://github.com/tomakehurst/wiremock/commit/a48315b54587fa6) Tom Akehurst *2016-07-11 20:31:14*
 
**Fixed bump-version in build.gradle**
 
 
[cd14409f654bfe4](https://github.com/tomakehurst/wiremock/commit/cd14409f654bfe4) Tom Akehurst *2016-07-11 20:30:04*
 
**Added extra event tracking to site analytics.**
 
 
[2b470cc7746ae38](https://github.com/tomakehurst/wiremock/commit/2b470cc7746ae38) Tom Akehurst *2016-07-11 09:04:01*
 
**Fixed version number interpolation on a couple of docs pages**
 
 
[0b5aef1db8662f6](https://github.com/tomakehurst/wiremock/commit/0b5aef1db8662f6) Tom Akehurst *2016-07-09 22:14:09*
 
 
## 2.1.6
### No issue
 
**Added the ability to override the Host header in the HTTP admin client**
 
 
[1cff8d2328fab4a](https://github.com/tomakehurst/wiremock/commit/1cff8d2328fab4a) Tom Akehurst *2016-07-09 22:05:07*
 
**Switched to using reflection to grab Jetty's request URI in order to work with Jetty 9.2 and 9.3**
 
 
[2e14f0af60b5800](https://github.com/tomakehurst/wiremock/commit/2e14f0af60b5800) Tom Akehurst *2016-07-09 14:38:36*
 
**Changed to GA version**
 
 
[0dab49a9212f9e3](https://github.com/tomakehurst/wiremock/commit/0dab49a9212f9e3) Tom Akehurst *2016-07-08 21:30:05*
 
 
## 2.1.5-rc4
### GitHub [#403](https://github.com/tomakehurst/wiremock/issues/403) Log the client IP for incoming requests    *Feature request*  
 
**#403 - Log the client IP for incoming requests**
 
 
[8071f64b8574aeb](https://github.com/tomakehurst/wiremock/commit/8071f64b8574aeb) Belema Gancarz *2016-06-01 08:53:28*
 
 
### GitHub [#449](https://github.com/tomakehurst/wiremock/issues/449) NullPointerException in 2.1.0-beta, when ClasspathFileSource is pointing to resources inside a jar  
 
**Fixed #449 - NPE when using a ClasspathFileSource with the JSON mapping loader.**
 
 
[7f93b5eb996722c](https://github.com/tomakehurst/wiremock/commit/7f93b5eb996722c) Tom Akehurst *2016-07-01 14:50:46*
 
 
### Jira gh-407   
 
**Isolate jetty dependencies into a single package**
 
 * The servlet and request adapters have moved to the &quot;servlet&quot; package. 
 * The only dependency they had on jetty was conditional anyway, so 
 * the condition was also modified to not even require jetty on the 
 * classpath. 
 * See gh-407. Not a complete modularization yet, but splits up the 
 * servlet-only stuff from the jetty server. 
 
[ae13c55b27b1ab8](https://github.com/tomakehurst/wiremock/commit/ae13c55b27b1ab8) Dave Syer *2016-06-28 16:31:04*
 
 
### No issue
 
**Added Piksel logo and tweaked logos layout**
 
 
[a1a952fc1412ebf](https://github.com/tomakehurst/wiremock/commit/a1a952fc1412ebf) Tom Akehurst *2016-07-08 15:19:54*
 
**Removed dummy posts**
 
 
[4cae10bfde23ab1](https://github.com/tomakehurst/wiremock/commit/4cae10bfde23ab1) Tom Akehurst *2016-07-07 14:05:42*
 
**Added GA conversion event to the MockLab popup button**
 
 
[24c8331e3927449](https://github.com/tomakehurst/wiremock/commit/24c8331e3927449) Tom Akehurst *2016-07-07 13:58:02*
 
**Removed some commented out code**
 
 
[1f2ca6194849b0c](https://github.com/tomakehurst/wiremock/commit/1f2ca6194849b0c) Tom Akehurst *2016-07-07 13:57:42*
 
**Copy tweak on homepage. Added support and training page.**
 
 
[35e954e2740a893](https://github.com/tomakehurst/wiremock/commit/35e954e2740a893) Tom Akehurst *2016-07-07 11:29:41*
 
**Various minor doc tweaks.**
 
 
[dea0096a9cc9de5](https://github.com/tomakehurst/wiremock/commit/dea0096a9cc9de5) Tom Akehurst *2016-07-07 11:14:00*
 
**Corrected a typo on the website and hid the pop-up div**
 
 
[4690b48536c3716](https://github.com/tomakehurst/wiremock/commit/4690b48536c3716) Tom Akehurst *2016-07-07 10:16:33*
 
**Added cookie logic to MockLab pop-up so it is only seen once**
 
 
[90ed9c9675a6baf](https://github.com/tomakehurst/wiremock/commit/90ed9c9675a6baf) Tom Akehurst *2016-07-05 17:31:17*
 
**More styling of the MockLab pop-up**
 
 
[756e036a4224705](https://github.com/tomakehurst/wiremock/commit/756e036a4224705) Tom Akehurst *2016-07-05 17:19:54*
 
**Added MockLab pop-up (without cookie logic yet)**
 
 
[69d3aaaf21eae5d](https://github.com/tomakehurst/wiremock/commit/69d3aaaf21eae5d) Tom Akehurst *2016-07-05 16:27:01*
 
**Added more logos to the homepage**
 
 
[1da193a0a81a913](https://github.com/tomakehurst/wiremock/commit/1da193a0a81a913) Tom Akehurst *2016-07-05 12:52:40*
 
**Made the wiremock version a variable in the v2 doc site**
 
 
[d519171e88a9954](https://github.com/tomakehurst/wiremock/commit/d519171e88a9954) Tom Akehurst *2016-07-05 12:33:51*
 
**Added v2 docs site**
 
 
[a2ef7fc42f39487](https://github.com/tomakehurst/wiremock/commit/a2ef7fc42f39487) Tom Akehurst *2016-07-05 12:27:32*
 
**Made remove mapping naming consistent**
 
 
[48afc211a8b128a](https://github.com/tomakehurst/wiremock/commit/48afc211a8b128a) Tom Akehurst *2016-07-04 19:05:23*
 
**Made consistent use of Guava base64 encoder/decoder. Switched to an HttpClient StringEntity constructor compatible with Android.**
 
 
[37ba883f553d462](https://github.com/tomakehurst/wiremock/commit/37ba883f553d462) Tom Akehurst *2016-07-03 19:05:14*
 
**Bumped version**
 
 
[6feb37b21c91634](https://github.com/tomakehurst/wiremock/commit/6feb37b21c91634) Tom Akehurst *2016-07-01 21:16:00*
 
**Switch to global ignoring of null attributes when serialising to JSON**
 
 
[b071d53520d353b](https://github.com/tomakehurst/wiremock/commit/b071d53520d353b) Tom Akehurst *2016-07-01 21:14:57*
 
**Added test cases for specifying absent query parameters**
 
 
[1ff985d575a2f8f](https://github.com/tomakehurst/wiremock/commit/1ff985d575a2f8f) Tom Akehurst *2016-07-01 14:55:49*
 
**Fixed inconsistency in query parameter encoding when matching - now matches unencoded for both stubbing and verification**
 
 
[a467485b9143c04](https://github.com/tomakehurst/wiremock/commit/a467485b9143c04) Tom Akehurst *2016-07-01 13:17:57*
 
**Added static imports for line separators in pretty printing test cases**
 
 
[198916c296643b3](https://github.com/tomakehurst/wiremock/commit/198916c296643b3) Tom Akehurst *2016-07-01 12:28:32*
 
**Unit test fixes for pretty print**
 
 * The pretty print library used appears to create system specific 
 * new line characters. Now the non-ignored unit tests pass on 
 * Windows. 
 
[6c9837621fafbda](https://github.com/tomakehurst/wiremock/commit/6c9837621fafbda) Jeremy D. Young *2016-06-30 15:43:40*
 
**Added test cases for an alternative HTTP server setup and support for no fault injector being present.**
 
 
[a52f05d372ed729](https://github.com/tomakehurst/wiremock/commit/a52f05d372ed729) Tom Akehurst *2016-06-29 14:42:39*
 
**Add a FaultInjectorFactory abstraction**
 
 * Isolates Jetty dependencies from the servlet. 
 
[fd0bcd6f9809b59](https://github.com/tomakehurst/wiremock/commit/fd0bcd6f9809b59) Dave Syer *2016-06-29 00:05:23*
 
**remove the system out**
 
 
[40b2e1c8e269dec](https://github.com/tomakehurst/wiremock/commit/40b2e1c8e269dec) Abha Gupta *2016-06-20 20:14:30*
 
**changes to support android https**
 
 
[529a395c16edcff](https://github.com/tomakehurst/wiremock/commit/529a395c16edcff) Abha Gupta *2016-06-20 17:39:30*
 
**Minor tweaks to the remove stub feature**
 
 
[cda3245208fc0a7](https://github.com/tomakehurst/wiremock/commit/cda3245208fc0a7) Tom Akehurst *2016-06-17 13:56:22*
 
**Fixed precondition check in the build and removed broken println**
 
 
[af93a13eb0c626b](https://github.com/tomakehurst/wiremock/commit/af93a13eb0c626b) Tom Akehurst *2016-06-17 13:21:23*
 
**refine stubbing and verification acceptance tests for urlEqualTo, urlPathEqualTo & urlPathMatching**
 
 
[7207fd287ed1113](https://github.com/tomakehurst/wiremock/commit/7207fd287ed1113) Florian Lasinger *2016-06-16 11:51:12*
 
**documentation for remove api**
 
 
[716b48d01f093f2](https://github.com/tomakehurst/wiremock/commit/716b48d01f093f2) Akshay Deodhar G *2016-06-15 14:12:49*
 
**merging remaining upstream changes**
 
 
[41c55a8a1b3a7c4](https://github.com/tomakehurst/wiremock/commit/41c55a8a1b3a7c4) Akshay Deodhar G *2016-06-15 13:36:33*
 
**synced the fork with upstream 2.0-beta resolved conflicts..**
 
 
[3886dd9b42ac91a](https://github.com/tomakehurst/wiremock/commit/3886dd9b42ac91a) Akshay Deodhar G *2016-06-15 12:49:28*
 
**Modified remove method to support removing stub via getRequest if uuid match is not found. First one is removed.**
 
 * Added RemoveStubMappingAcceptanceTest with 1. remove stub that exists using appropriate uuid 2. remove stub that exists with remove call has request that match but uuid do not match. 3. same as 2 with remove call has no UUID present 4. remove stub that does not exist 
 
[f18ff6db14c3507](https://github.com/tomakehurst/wiremock/commit/f18ff6db14c3507) Akshay Deodhar G *2016-06-15 05:53:30*
 
**HttpAdminClient - removing custommatcher lookup**
 
 * now stubs are matched based on UUID rather then request pattern. 
 
[603046b42b22244](https://github.com/tomakehurst/wiremock/commit/603046b42b22244) Akshay Deodhar G *2016-06-14 16:39:43*
 
**HttpAdminClient - implemented removeStubMapping**
 
 * Stubbing interface now has - remove mapping method and corresponding changes in implementation 
 
[bdc46d623d2edf7](https://github.com/tomakehurst/wiremock/commit/bdc46d623d2edf7) Akshay Deodhar G *2016-06-14 12:48:06*
 
**Adding Remove API in stand alone mode**
 
 
[88e34c3b07763d8](https://github.com/tomakehurst/wiremock/commit/88e34c3b07763d8) Akshay Deodhar G *2016-06-13 20:15:34*
 
**Better name for test and more precise assertion of expected behaviour**
 
 
[b3e49e5c9b67605](https://github.com/tomakehurst/wiremock/commit/b3e49e5c9b67605) Robert *2016-06-07 20:20:23*
 
**Removes unused class**
 
 
[add82b18f8950a0](https://github.com/tomakehurst/wiremock/commit/add82b18f8950a0) Robert *2016-06-07 20:11:41*
 
**Reverts to WireMock 1 behaviour - Date header only returned if stubbed**
 
 
[ab3e0935c3d6bfc](https://github.com/tomakehurst/wiremock/commit/ab3e0935c3d6bfc) Robert *2016-06-07 16:46:32*
 
**Accept gzipped request bodies**
 
 
[9a239fb16e3b56e](https://github.com/tomakehurst/wiremock/commit/9a239fb16e3b56e) Seth Bresnett *2016-06-03 12:08:50*
 
**Specify file encoding for gradle compile test task**
 
 
[d300c7c0a1080f0](https://github.com/tomakehurst/wiremock/commit/d300c7c0a1080f0) Belema Gancarz *2016-05-24 14:55:45*
 
**json encoding is not lost when mocking with java api**
 
 
[0305fa43cbe6aee](https://github.com/tomakehurst/wiremock/commit/0305fa43cbe6aee) Tomasz Wroniak *2016-05-20 11:08:08*
 
**Made HttpClient respect system properties**
 
 
[d9b207d273feeac](https://github.com/tomakehurst/wiremock/commit/d9b207d273feeac) Kjetil Valstadsve *2016-04-24 09:59:18*
 
**Added support for matching on cookies**
 
 
[7c14a56721ecefb](https://github.com/tomakehurst/wiremock/commit/7c14a56721ecefb) Tom Akehurst *2016-03-01 14:58:21*
 
**Remved JsonStubMappingCreator as it was only used in one place and was scarcely doing anything**
 
 
[a3cd3caa3ec9412](https://github.com/tomakehurst/wiremock/commit/a3cd3caa3ec9412) Tom Akehurst *2016-02-28 22:07:00*
 
**Removed dependency on commons lang (excessive, since it was only used in once place for string replacement)**
 
 
[3c2aee4d6aeb23e](https://github.com/tomakehurst/wiremock/commit/3c2aee4d6aeb23e) Tom Akehurst *2016-02-28 21:41:14*
 
**Minor tidy-up of base64 body support and removal of redundant constructor in LoggedRequest**
 
 
[8fc98c6d756be36](https://github.com/tomakehurst/wiremock/commit/8fc98c6d756be36) Tom Akehurst *2016-02-24 09:46:04*
 
**Added support for basic authentication (pre-emptive only at this stage)**
 
 
[1d50e2cb01f935e](https://github.com/tomakehurst/wiremock/commit/1d50e2cb01f935e) Tom Akehurst *2016-02-23 20:04:02*
 
**Updated Java API to handle base64 body and updated associated tests.**
 
 
[15d5ea31e5db442](https://github.com/tomakehurst/wiremock/commit/15d5ea31e5db442) Paul Smith *2016-02-22 11:49:07*
 
**Added correct branch check before publish step**
 
 
[58cdf6eb6d3566d](https://github.com/tomakehurst/wiremock/commit/58cdf6eb6d3566d) Tom Akehurst *2016-02-19 10:33:11*
 
**Bumped version**
 
 
[a88f0fc3c0369ca](https://github.com/tomakehurst/wiremock/commit/a88f0fc3c0369ca) Tom Akehurst *2016-02-19 10:26:10*
 
**Added bodyAsBase64 element to LoggedRequest JSON in output from querying request details via REST api.**
 
 
[df7cbb27b9b66e0](https://github.com/tomakehurst/wiremock/commit/df7cbb27b9b66e0) Paul Smith *2016-02-17 13:22:05*
 
**Save edited mapping to the file it was loaded from**
 
 
[a093d20ddc15cb6](https://github.com/tomakehurst/wiremock/commit/a093d20ddc15cb6) Dipanjan Laha *2016-01-27 22:07:21*
 
**Added options() factory method to WireMockConfiguration**
 
 
[bb717d1689bc4ed](https://github.com/tomakehurst/wiremock/commit/bb717d1689bc4ed) Tom Akehurst *2016-01-23 21:50:18*
 
**Factored out a Predicate generator function for filtering extension classes**
 
 
[e5827d8187a9e83](https://github.com/tomakehurst/wiremock/commit/e5827d8187a9e83) Tom Akehurst *2016-01-22 09:19:26*
 
**Add missing test case**
 
 * Add missing test case for CommandLineOptions.extensionOfType filtered 
 * for RequestMatcherExtensions 
 
[e2f0f5084018d16](https://github.com/tomakehurst/wiremock/commit/e2f0f5084018d16) Rainer Friesen *2016-01-20 13:08:10*
 
**Fix issue  using Map<String, Object>**
 
 * Switch to ExtensionLoader.load which is directly returning a Map&lt;String, 
 * Extension&gt; which should prevent build issues with incompatible types. 
 
[cdeaeacfae97314](https://github.com/tomakehurst/wiremock/commit/cdeaeacfae97314) Rainer Friesen *2016-01-20 10:01:25*
 
**Fix ClassCastException in CommandLineOptions.extensionOfType**
 
 * Prevent ClassCastException when adding custom RequestMatcher or 
 * ResponseDefinitionTransformer via command line option. 
 
[32aecc88f131448](https://github.com/tomakehurst/wiremock/commit/32aecc88f131448) Rainer Friesen *2016-01-20 09:39:44*
 
**Added ability to edit stub mappings via an ID. Many thanks @dlaha21**
 
 
[aae95a255090d75](https://github.com/tomakehurst/wiremock/commit/aae95a255090d75) Tom Akehurst *2016-01-14 09:40:27*
 
**Test to ensure LocalMappingBuilder and RemoteMappingBuilder are the same**
 
 
[1ed5e33eceb1b49](https://github.com/tomakehurst/wiremock/commit/1ed5e33eceb1b49) Rowan Hill *2016-01-04 20:52:16*
 
**ScenarioMappingBuilder is no longer generic, does not override methods**
 
 * The previously overridden methods are redundant; the actual interface of 
 * ScenarioMappingBuilder is unchanged. 
 
[8798be2328fd793](https://github.com/tomakehurst/wiremock/commit/8798be2328fd793) Rowan Hill *2016-01-04 20:34:38*
 
**MappingBuilder always returns MappingBuilder, not ScenarioMappingBuilder**
 
 * Given that instances of MappingBuilder will always be referenced as one 
 * of its interfaces (which is guaranteed by MappingBuilder being package 
 * private), this shouldn&#39;t present a problem, and is more consistent. 
 
[439e84fd1b074d8](https://github.com/tomakehurst/wiremock/commit/439e84fd1b074d8) Rowan Hill *2016-01-04 20:33:11*
 
**Remove superfluous @SuppressWarnings from MappingBuilder**
 
 
[f60e33ff3e6c9c0](https://github.com/tomakehurst/wiremock/commit/f60e33ff3e6c9c0) Rowan Hill *2016-01-04 20:28:48*
 
**LocalMappingBuilder returns LocalMappingBuilder (not RemoteMappingBuilder)**
 
 
[6eb7ab48d505053](https://github.com/tomakehurst/wiremock/commit/6eb7ab48d505053) Rowan Hill *2016-01-04 20:27:14*
 
**Added copyright headers to new files**
 
 
[652607f1fb7f5b3](https://github.com/tomakehurst/wiremock/commit/652607f1fb7f5b3) Tom Akehurst *2015-01-03 21:37:07*
 
**Refactored MappingBuilder back to one impl class with a hierarchy of interfaces to distinguish local/remote/scenario**
 
 
[ddbd84a87e2fa77](https://github.com/tomakehurst/wiremock/commit/ddbd84a87e2fa77) Tom Akehurst *2015-01-03 21:36:36*
 
**Minor tidy-up and addition of copyright headers for typesafe scenario DSL**
 
 
[8a2168a359f15cc](https://github.com/tomakehurst/wiremock/commit/8a2168a359f15cc) Tom Akehurst *2015-01-03 19:56:46*
 
**Genericise (Local)MappingBuilder to disallow states without scenarios**
 
 
[2fe234ede53bc7d](https://github.com/tomakehurst/wiremock/commit/2fe234ede53bc7d) Rowan Hill *2015-01-01 16:58:26*
 
 
## 2.1.4-rc3
### No issue
 
**Bumped version**
 
 
[803ec35edf502ea](https://github.com/tomakehurst/wiremock/commit/803ec35edf502ea) Tom Akehurst *2016-06-29 21:56:21*
 
**Fixed a further potential bug where non-XML is passed to an XML matcher, with additional tests. Also wrote additional equivalent tests for JSON matching. Made JSON matching lazy when possible for reduced compute.**
 
 
[52d427f0f04f6d4](https://github.com/tomakehurst/wiremock/commit/52d427f0f04f6d4) Tom Akehurst *2016-06-29 21:54:40*
 
 
## 2.1.3-rc2
### GitHub [#445](https://github.com/tomakehurst/wiremock/issues/445) The new matching system refactor has removed short circuiting behaviour  
 
**Fixed #445 - exception thrown when matching a stub with a body against a request without one due to inappropriately eager distance calculation in RequestPattern.**
 
 
[fcdf84f36401fa2](https://github.com/tomakehurst/wiremock/commit/fcdf84f36401fa2) Tom Akehurst *2016-06-29 21:27:23*
 
 
### No issue
 
**Bumped version**
 
 
[b63fef4edfa6f8c](https://github.com/tomakehurst/wiremock/commit/b63fef4edfa6f8c) Tom Akehurst *2016-06-29 21:29:27*
 
**Updated README**
 
 
[b4d99453841940b](https://github.com/tomakehurst/wiremock/commit/b4d99453841940b) Tom Akehurst *2016-06-29 18:39:16*
 
**Fixed branch check on release to master**
 
 
[e5949db4084cc96](https://github.com/tomakehurst/wiremock/commit/e5949db4084cc96) Tom Akehurst *2016-06-29 16:20:24*
 
 
## 2.1.2-rc1
### No issue
 
**Bumped to rc1 version. Updated homepage to reflect RC status.**
 
 
[42f067e49fc9d2e](https://github.com/tomakehurst/wiremock/commit/42f067e49fc9d2e) Tom Akehurst *2016-06-29 16:17:59*
 
 
## 2.1.1-beta
### No issue
 
**Bumped version**
 
 
[5606dacb291a60d](https://github.com/tomakehurst/wiremock/commit/5606dacb291a60d) Tom Akehurst *2016-06-28 13:09:55*
 
**Fixed version numbers in docs**
 
 
[1ef9481dbceb43b](https://github.com/tomakehurst/wiremock/commit/1ef9481dbceb43b) Tom Akehurst *2016-06-28 13:09:27*
 
**Removed original request from the JSON representation of ResponseDefinition**
 
 
[1462ff3b5847f87](https://github.com/tomakehurst/wiremock/commit/1462ff3b5847f87) Tom Akehurst *2016-06-28 10:43:46*
 
**Switched base64 implementation to Guava's to avoid Commons Codec compatibility problems on Android**
 
 
[2b5a6ccdcb0b41e](https://github.com/tomakehurst/wiremock/commit/2b5a6ccdcb0b41e) Tom Akehurst *2016-06-28 10:24:15*
 
 
## 2.1.0-beta
### No issue
 
**Tweaked unmatched requests verification exception message to include diffs with nearest match (rather than just referring to the logs)**
 
 
[bee1f8b04ae4ee1](https://github.com/tomakehurst/wiremock/commit/bee1f8b04ae4ee1) Tom Akehurst *2016-06-15 09:34:16*
 
**Added missing near misses methods to the Stubbing interface.**
 
 
[fb6734851e42ccc](https://github.com/tomakehurst/wiremock/commit/fb6734851e42ccc) Tom Akehurst *2016-06-15 09:00:59*
 
**Now saves ObjectMapper instances in a ThreadLocal to avoid the overhead of creating one for each parsing/writing task.**
 
 
[d843c2625379188](https://github.com/tomakehurst/wiremock/commit/d843c2625379188) Tom Akehurst *2016-06-15 08:48:55*
 
**Switched use of Optional.fromNullable(...).or(...) to firstNonNull(...)**
 
 
[e701159bf2ddfd9](https://github.com/tomakehurst/wiremock/commit/e701159bf2ddfd9) Tom Akehurst *2016-06-15 08:42:55*
 
**Upped minor version and bump logic in build**
 
 
[18059ed8de531f2](https://github.com/tomakehurst/wiremock/commit/18059ed8de531f2) Tom Akehurst *2016-06-14 22:35:17*
 
**Totally refactored the matching system to introduce the concept of distance. Used this to add ability to calculate "nearest misses" - pairs of request and request pattern with the lowest distance. Verification exceptions now print JUnit style diff output that IntelliJ turns into a diff window. JUnit rule now defaults to failing if any requests weren't matched during the test case (or class).**
 
 
[acc9871a6e1648e](https://github.com/tomakehurst/wiremock/commit/acc9871a6e1648e) Tom Akehurst *2016-06-14 22:31:07*
 
 
## 2.0.10-beta
### No issue
 
**Bumped version**
 
 
[369c9d3254376fd](https://github.com/tomakehurst/wiremock/commit/369c9d3254376fd) Tom Akehurst *2016-02-12 09:05:08*
 
 
## 2.0.9-beta
### No issue
 
**Now using a trust strategy which accepts all certificates instead of the TrustSelfSignedStrategy, which checks if the chain length is exactly 1.**
 
 
[1f7ad84a37003e3](https://github.com/tomakehurst/wiremock/commit/1f7ad84a37003e3) Moritz Kammerer *2016-01-27 08:39:14*
 
 
## 2.0.8-beta
### No issue
 
**Bumped version**
 
 
[3e5b660f6fdb378](https://github.com/tomakehurst/wiremock/commit/3e5b660f6fdb378) Tom Akehurst *2015-12-19 14:30:38*
 
**Proxy response renderer now sends all values of a request header to the target rather than just the first**
 
 
[8fdc4b30d791b63](https://github.com/tomakehurst/wiremock/commit/8fdc4b30d791b63) Tom Akehurst *2015-12-18 09:07:01*
 
**Mapping recorder now removes Content-Length header from responses so that they are calculated by Jetty**
 
 
[aa05ee5b9091239](https://github.com/tomakehurst/wiremock/commit/aa05ee5b9091239) Tom Akehurst *2015-12-17 11:15:10*
 
**Added shortcut methods in the stubbing DSL for uniform and log normal random delays**
 
 
[4d241d6ab3e27dc](https://github.com/tomakehurst/wiremock/commit/4d241d6ab3e27dc) Tom Akehurst *2015-12-09 21:44:53*
 
**Added missing copyright headers**
 
 
[8fb97d7a1bc8993](https://github.com/tomakehurst/wiremock/commit/8fb97d7a1bc8993) Tom Akehurst *2015-12-09 21:35:39*
 
**Add uniform distribution for random delays**
 
 
[89501110bd73bbe](https://github.com/tomakehurst/wiremock/commit/89501110bd73bbe) James Ravn *2015-12-09 21:27:29*
 
**Allow setting random delays globally**
 
 * Just like fixed delays, randomly distributed delays can be set for all 
 * stubs. 
 * It&#39;s a bit messier than I&#39;d like, but the existing global fixed delay is 
 * a bit difficult to expand. 
 * I&#39;ve tried to keep it consistent with stubbing in that the delays are 
 * independent of each other and can be combined. 
 
[7a64ec47ba00018](https://github.com/tomakehurst/wiremock/commit/7a64ec47ba00018) James Ravn *2015-12-09 21:06:45*
 
**Add documentation for random delays**
 
 
[528bd382ec40ed4](https://github.com/tomakehurst/wiremock/commit/528bd382ec40ed4) James Ravn *2015-12-09 13:10:13*
 
**Support randomly distributed delays for responses**
 
 * This expands on the existing fixed delay functionality by providing a 
 * more general feature to draw values from a random distribution. 
 * This allows teams to simulate long tails in delays from downstream 
 * systems, a common scenario in load and resiliency tests. 
 * I&#39;ve provided a log normal implementation out of the box, which gives a 
 * pretty good long tail distribution for modeling delays. It also has the 
 * nice benefit of being able to specify the 50th percentile which is a 
 * commonly tracked metric. 
 * Here is an example priming using the log normal delay: 
 * { 
 * &quot;request&quot;: { 
 * &quot;method&quot;: &quot;GET&quot;, 
 * &quot;url&quot;: &quot;/some/thing&quot; 
 * }, 
 * &quot;response&quot;: { 
 * &quot;status&quot;: 200, 
 * &quot;body&quot;: &quot;Hello world!&quot;, 
 * &quot;headers&quot;: { 
 * &quot;Content-Type&quot;: &quot;text/plain&quot; 
 * }, 
 * &quot;delayDistribution&quot;: { 
 * &quot;type&quot;: &quot;lognormal&quot;, 
 * &quot;median&quot;: 80, 
 * &quot;sigma&quot;: 0.4 
 * } 
 * } 
 * } 
 * This example can be viewed visually at wolfram alpha: 
 * https://www.wolframalpha.com/input/?i=lognormaldistribution%28log%2890%29%2C+0.4%29 
 * New distributions can be added by implementing `DelayDistribution` and 
 * adding it to the @JsonTypeInfo in the interface. 
 
[c327c2145e670de](https://github.com/tomakehurst/wiremock/commit/c327c2145e670de) James Ravn *2015-12-08 19:47:40*
 
**Using StringEntity Constructor Available on Android HttpClient Version**
 
 
[df2ccc67b42c000](https://github.com/tomakehurst/wiremock/commit/df2ccc67b42c000) Sam (@HandstandSam) Edwards *2015-12-08 01:46:25*
 
**Added some extra tests for multiple query value matching**
 
 
[ae98d14c2e87284](https://github.com/tomakehurst/wiremock/commit/ae98d14c2e87284) Tom Akehurst *2015-12-07 21:52:29*
 
**Fixed url path matching bug where URL paths with additional characters got matched when exact match was expected**
 
 
[4abff7ad78e6775](https://github.com/tomakehurst/wiremock/commit/4abff7ad78e6775) Tom Akehurst *2015-12-07 21:52:29*
 
**Removed request delay feature as it has little practical purpose, not being able to create a socket connect exception**
 
 
[4040f9d86a6dc74](https://github.com/tomakehurst/wiremock/commit/4040f9d86a6dc74) Tom Akehurst *2015-12-07 21:52:28*
 
**Fix typo**
 
 
[5ae939b4209f3d8](https://github.com/tomakehurst/wiremock/commit/5ae939b4209f3d8) Seth Bresnett *2015-12-07 16:24:32*
 
 
## 2.0.7-beta
### No issue
 
**Added support for gzip encoded responses (from non-gzipped mappings) and un-gzipping when recording mappings**
 
 
[45c7f9ad05999e6](https://github.com/tomakehurst/wiremock/commit/45c7f9ad05999e6) Tom Akehurst *2015-12-02 18:23:31*
 
**Added scheme parameter to WireMock (client) constructor and static config methods. Modified HttpsAcceptanceTest to conenct to admin over HTTPS. Deleted rendundant test.**
 
 
[396fc7581b935e8](https://github.com/tomakehurst/wiremock/commit/396fc7581b935e8) Tom Akehurst *2015-11-23 19:41:34*
 
**Added https support and builder for HttpAdminClient**
 
 
[caa7a0e8352b7ab](https://github.com/tomakehurst/wiremock/commit/caa7a0e8352b7ab) edriggs *2015-11-03 10:52:57*
 
**Added docs for relational verification operators**
 
 
[7cf9ffd9e0e59fb](https://github.com/tomakehurst/wiremock/commit/7cf9ffd9e0e59fb) Tom Akehurst *2015-10-26 19:19:33*
 
**Added ability to veryify requests using relational operators**
 
 
[f8f453d479ca931](https://github.com/tomakehurst/wiremock/commit/f8f453d479ca931) Sam Pengilly *2015-10-26 19:17:40*
 
**Upped Jetty version to 9.2.13. Tweaks to Jetty shutdown process.**
 
 
[8cf4fae08f86686](https://github.com/tomakehurst/wiremock/commit/8cf4fae08f86686) Tom Akehurst *2015-10-26 08:32:35*
 
**Changed Jetty thread pools sizes to lower defaults**
 
 
[4ab4271a6f06411](https://github.com/tomakehurst/wiremock/commit/4ab4271a6f06411) Tom Akehurst *2015-10-24 11:28:47*
 
**Bumped version**
 
 
[3852e1435f05f7f](https://github.com/tomakehurst/wiremock/commit/3852e1435f05f7f) Tom Akehurst *2015-10-17 16:24:19*
 
 
## 1.58
### No issue
 
**Bumped version**
 
 
[c1e3a7d2d0c1157](https://github.com/tomakehurst/wiremock/commit/c1e3a7d2d0c1157) Tom Akehurst *2015-11-12 13:23:32*
 
**Added presentation video link to docs**
 
 
[d133e955bf6c18b](https://github.com/tomakehurst/wiremock/commit/d133e955bf6c18b) Tom Akehurst *2015-10-24 10:55:00*
 
**Added note to docs about PRs against branch**
 
 
[cf6cdefbe8f38da](https://github.com/tomakehurst/wiremock/commit/cf6cdefbe8f38da) Tom Akehurst *2015-08-28 13:13:08*
 
**Fixed Travis SVG back to master branch**
 
 
[585f7628d7eaa85](https://github.com/tomakehurst/wiremock/commit/585f7628d7eaa85) Tom Akehurst *2015-08-28 13:09:05*
 
**Updated README and HTML docs for 2.0-beta.**
 
 
[64852e28650a692](https://github.com/tomakehurst/wiremock/commit/64852e28650a692) Tom Akehurst *2015-08-28 13:07:55*
 
**making wireMock work with parallel thread execution by using a thread**
 
 * local 
 
[1d3136ae52a5843](https://github.com/tomakehurst/wiremock/commit/1d3136ae52a5843) ashley-taylor *2015-07-30 22:23:27*
 
 
## 2.0.6-beta
### No issue
 
**Added doc for status message setting**
 
 
[f7f3dc378b113fa](https://github.com/tomakehurst/wiremock/commit/f7f3dc378b113fa) Tom Akehurst *2015-10-17 16:12:23*
 
**Added copyright headers**
 
 
[cdbf01905b2eba1](https://github.com/tomakehurst/wiremock/commit/cdbf01905b2eba1) Tom Akehurst *2015-10-17 16:12:23*
 
**Added ability to set the response status message**
 
 
[6cb01cb079a9989](https://github.com/tomakehurst/wiremock/commit/6cb01cb079a9989) Tom Akehurst *2015-10-17 16:12:23*
 
**Added doc for dynamic port allocation**
 
 
[49dccecfcc8b7bc](https://github.com/tomakehurst/wiremock/commit/49dccecfcc8b7bc) Tom Akehurst *2015-10-17 16:12:23*
 
**Implemented equals for HttpHeader**
 
 
[dd7414cd0e472ec](https://github.com/tomakehurst/wiremock/commit/dd7414cd0e472ec) Adrian Ng *2015-10-16 20:36:20*
 
**Bumped version**
 
 
[8fea92df72f23fb](https://github.com/tomakehurst/wiremock/commit/8fea92df72f23fb) Tom Akehurst *2015-10-03 20:30:14*
 
**Now checks for jdk7 when releasing**
 
 
[b8966caf9da3691](https://github.com/tomakehurst/wiremock/commit/b8966caf9da3691) Tom Akehurst *2015-10-02 16:51:20*
 
 
## 2.0.5-beta
### No issue
 
**Further fix to bump-version**
 
 
[e9d13f0466854cf](https://github.com/tomakehurst/wiremock/commit/e9d13f0466854cf) Tom Akehurst *2015-10-01 15:59:53*
 
**Fixed versions in docs and bump-version build task**
 
 
[b615aeaa00be4d7](https://github.com/tomakehurst/wiremock/commit/b615aeaa00be4d7) Tom Akehurst *2015-10-01 15:58:02*
 
**Local repo publish now pushes to Maven local**
 
 
[f506c7e2373a8c9](https://github.com/tomakehurst/wiremock/commit/f506c7e2373a8c9) Tom Akehurst *2015-09-30 08:44:33*
 
**Added ability to use custom matchers when verifying. Made it a compile error to attempt to register an inline custom matcher when using the remote admin interface. Pulled out a RequestMatcher interface with a single method so that Java 8 lambdas can be used.**
 
 
[f510b7da082faba](https://github.com/tomakehurst/wiremock/commit/f510b7da082faba) Tom Akehurst *2015-09-29 19:47:44*
 
**Documented custom request matchers**
 
 
[0eaca3b43b69d7e](https://github.com/tomakehurst/wiremock/commit/0eaca3b43b69d7e) Tom Akehurst *2015-09-28 08:36:03*
 
**Added jdk 7 back into the Travis config**
 
 
[7151fd552919e58](https://github.com/tomakehurst/wiremock/commit/7151fd552919e58) Tom Akehurst *2015-09-27 18:57:39*
 
**Bumped version**
 
 
[070eec4a24a8b7d](https://github.com/tomakehurst/wiremock/commit/070eec4a24a8b7d) Tom Akehurst *2015-09-27 18:55:06*
 
 
## 2.0.4-beta
### No issue
 
**Documented ResponseTransformer**
 
 
[72244a026699c0c](https://github.com/tomakehurst/wiremock/commit/72244a026699c0c) Tom Akehurst *2015-09-27 18:52:58*
 
**Documented ResponseDefinitionTransformer**
 
 
[5aaf131ab32f891](https://github.com/tomakehurst/wiremock/commit/5aaf131ab32f891) Tom Akehurst *2015-09-27 18:38:56*
 
**Improved request logging. Now only logs the request once, and includes the response def and HTTP response.**
 
 
[2465470c534bf10](https://github.com/tomakehurst/wiremock/commit/2465470c534bf10) Tom Akehurst *2015-09-27 15:16:42*
 
**Bumped version**
 
 
[6fbb54429a60d9a](https://github.com/tomakehurst/wiremock/commit/6fbb54429a60d9a) Tom Akehurst *2015-09-26 20:41:55*
 
**Removed some debug code**
 
 
[5f59e02586a3794](https://github.com/tomakehurst/wiremock/commit/5f59e02586a3794) Tom Akehurst *2015-09-26 20:40:57*
 
**Added a parameterless requestMatching() overload**
 
 
[93db53c0c31d867](https://github.com/tomakehurst/wiremock/commit/93db53c0c31d867) Tom Akehurst *2015-09-26 20:38:24*
 
**Added custom matcher to RequestPattern in order to expose it via the JSON API. Tweaked the test to ensure the JSON API is used.**
 
 
[f17ce11ab946f1e](https://github.com/tomakehurst/wiremock/commit/f17ce11ab946f1e) Tom Akehurst *2015-09-26 20:29:20*
 
**Made test for globally specified matcher with parameters pass**
 
 
[30e8e53631cf4fb](https://github.com/tomakehurst/wiremock/commit/30e8e53631cf4fb) Tom Akehurst *2015-09-21 17:54:42*
 
 
## 2.0.3-beta
### No issue
 
**Bumped version**
 
 
[058ed1fb5cca3f0](https://github.com/tomakehurst/wiremock/commit/058ed1fb5cca3f0) Tom Akehurst *2015-09-18 08:36:35*
 
**Added test for global application of response transformer**
 
 
[ca7417e556b96c6](https://github.com/tomakehurst/wiremock/commit/ca7417e556b96c6) Tom Akehurst *2015-09-18 08:18:02*
 
**Added ResponseTransformer with parameters and added parameters to ResponseDefinitionTransformer**
 
 
[99a6f78cb2a5b01](https://github.com/tomakehurst/wiremock/commit/99a6f78cb2a5b01) Tom Akehurst *2015-09-18 08:09:46*
 
**@**
 
 
[db8fb98e8d22f79](https://github.com/tomakehurst/wiremock/commit/db8fb98e8d22f79) Tom Akehurst *2015-09-09 08:23:57*
 
**Updated docs with new build dependency configs**
 
 
[3bd4bfadb7373a1](https://github.com/tomakehurst/wiremock/commit/3bd4bfadb7373a1) Tom Akehurst *2015-09-09 08:23:28*
 
 
## 2.0.2-beta
### No issue
 
**Bumped version**
 
 
[d01ef3d1b028e5c](https://github.com/tomakehurst/wiremock/commit/d01ef3d1b028e5c) Tom Akehurst *2015-09-09 08:11:15*
 
**Restored JDK1.7 runtime compatibility (requiring a downgrade to Jetty 9.2)**
 
 
[46121c27993d646](https://github.com/tomakehurst/wiremock/commit/46121c27993d646) Tom Akehurst *2015-09-08 18:16:33*
 
**Last few fixes to new release process. Now working.**
 
 
[2430ce7cbc8609a](https://github.com/tomakehurst/wiremock/commit/2430ce7cbc8609a) Tom Akehurst *2015-09-06 22:34:49*
 
**Further fixes to new publish configuration. Not quite working yet but close.**
 
 
[7ef9fbd30d61beb](https://github.com/tomakehurst/wiremock/commit/7ef9fbd30d61beb) Tom Akehurst *2015-09-06 22:20:08*
 
 
## 2.0.1-beta
### No issue
 
**Restored uploadArchives condition on signing**
 
 
[012251fc1bb049b](https://github.com/tomakehurst/wiremock/commit/012251fc1bb049b) Tom Akehurst *2015-09-05 19:34:54*
 
**Added POM info on publish**
 
 
[f8f43cca6edf8e6](https://github.com/tomakehurst/wiremock/commit/f8f43cca6edf8e6) Tom Akehurst *2015-09-05 19:21:47*
 
**Fixed version bump**
 
 
[f8b44dff9b4f838](https://github.com/tomakehurst/wiremock/commit/f8b44dff9b4f838) Tom Akehurst *2015-09-05 16:33:11*
 
**Further fat JAR shading fix. Excluded JUnit from the fat JAR.**
 
 
[80a0c36ce4b717c](https://github.com/tomakehurst/wiremock/commit/80a0c36ce4b717c) Tom Akehurst *2015-09-05 16:30:28*
 
**Bumped version**
 
 
[fde2094b06f315e](https://github.com/tomakehurst/wiremock/commit/fde2094b06f315e) Tom Akehurst *2015-09-03 17:34:49*
 
**Add sources and javadocs JARs to both publications. Fix scopes in generated POM for thinJar. Fix packaging type in fat JAR POM.**
 
 
[734f5b338ed1ade](https://github.com/tomakehurst/wiremock/commit/734f5b338ed1ade) Tom Akehurst *2015-09-03 17:34:21*
 
**Fix thin JAR POM on publish**
 
 
[940f206bf3fbfaa](https://github.com/tomakehurst/wiremock/commit/940f206bf3fbfaa) Tom Akehurst *2015-09-03 14:44:13*
 
**Made local publishing repo relative to generic tmp dir (not my home dir)**
 
 
[da21eb22b5925c4](https://github.com/tomakehurst/wiremock/commit/da21eb22b5925c4) Tom Akehurst *2015-09-03 11:30:45*
 
**Added publishing plugin config to eventually replace uploadArchives**
 
 
[a0ec5789ba4f7ee](https://github.com/tomakehurst/wiremock/commit/a0ec5789ba4f7ee) Tom Akehurst *2015-09-03 11:27:47*
 
**Started adding Shadow JAR plugin as a replacement to JarJar**
 
 
[fab2649dc616505](https://github.com/tomakehurst/wiremock/commit/fab2649dc616505) Tom Akehurst *2015-09-02 16:49:37*
 
 
## 2.0.0-beta
### No issue
 
**Fixed bump-version for beta version scheme**
 
 
[e655e690676147f](https://github.com/tomakehurst/wiremock/commit/e655e690676147f) Tom Akehurst *2015-08-28 13:36:41*
 
**Updated version numbers in docs and build**
 
 
[b4240140546bbee](https://github.com/tomakehurst/wiremock/commit/b4240140546bbee) Tom Akehurst *2015-08-28 13:29:36*
 
**Tweaked README**
 
 
[a68a93e30ff5997](https://github.com/tomakehurst/wiremock/commit/a68a93e30ff5997) Tom Akehurst *2015-08-28 13:06:58*
 
**Added notes on 2.0-beta to the README and HTML docs**
 
 
[5056fe718209ef3](https://github.com/tomakehurst/wiremock/commit/5056fe718209ef3) Tom Akehurst *2015-08-28 13:00:56*
 
**ResponseDefinition is now mostly immutable. Only per-request fields are not.**
 
 
[95715b42b15b83a](https://github.com/tomakehurst/wiremock/commit/95715b42b15b83a) Tom Akehurst *2015-08-26 22:23:28*
 
**Removed setters from ResponseDefinition and made corresponding additions to ResponseDefinitionBuilder**
 
 
[02075200092fdcf](https://github.com/tomakehurst/wiremock/commit/02075200092fdcf) Tom Akehurst *2015-08-26 21:46:31*
 
**Factored out a response body class to encapsulate encoding (string, json, bytes, base64) logic.**
 
 
[64c17e85111daf1](https://github.com/tomakehurst/wiremock/commit/64c17e85111daf1) Tom Akehurst *2015-08-26 21:24:04*
 
**Switched ResponseDefinition and ResponseDefinitionBuilder to use constructor in prep for making immutable**
 
 
[1c12b166949b8b0](https://github.com/tomakehurst/wiremock/commit/1c12b166949b8b0) Tom Akehurst *2015-08-26 19:51:21*
 
**Removing openjdk8 from the Travis config as this isn't supported**
 
 
[568d6c55139d3f4](https://github.com/tomakehurst/wiremock/commit/568d6c55139d3f4) Tom Akehurst *2015-08-24 20:54:41*
 
**Also removed jdk7 Travis builds as we're deprecating runtime support for Java 7 (but keeping the language compatibility at that level).**
 
 
[96940e67ac990e3](https://github.com/tomakehurst/wiremock/commit/96940e67ac990e3) Tom Akehurst *2015-08-24 20:52:24*
 
**Fixed Travis config to remove jdk 6**
 
 
[de6853f9b993fe5](https://github.com/tomakehurst/wiremock/commit/de6853f9b993fe5) Tom Akehurst *2015-08-24 20:43:38*
 
**Upgraded Jackson to 2.6.1**
 
 
[88c9dbb87add979](https://github.com/tomakehurst/wiremock/commit/88c9dbb87add979) Tom Akehurst *2015-08-24 20:39:31*
 
**Upgraded JUnit to 4.12**
 
 
[e1eec2b85117b5b](https://github.com/tomakehurst/wiremock/commit/e1eec2b85117b5b) Tom Akehurst *2015-08-24 20:38:25*
 
**Upgraded JSONPath to 2.0.0. Fixed tests broken by this.**
 
 
[91889e8cfe36f2d](https://github.com/tomakehurst/wiremock/commit/91889e8cfe36f2d) Tom Akehurst *2015-08-24 20:38:12*
 
**Fixed browser proxying problem caused by Jetty upgrade**
 
 
[8663cefe5403349](https://github.com/tomakehurst/wiremock/commit/8663cefe5403349) Tom Akehurst *2015-08-24 20:17:16*
 
**Updated the Gradle wrapper to v2.6**
 
 
[2d50162fe92c345](https://github.com/tomakehurst/wiremock/commit/2d50162fe92c345) Tom Akehurst *2015-08-24 19:27:06*
 
**Bumped version to 1.58**
 
 
[7347db51ef3c2b2](https://github.com/tomakehurst/wiremock/commit/7347db51ef3c2b2) Tom Akehurst *2015-08-24 19:15:25*
 
**Removing jdk6 from the Travis file again. Duh.**
 
 
[ca2f5d3999fae4a](https://github.com/tomakehurst/wiremock/commit/ca2f5d3999fae4a) Tom Akehurst *2015-02-24 13:40:30*
 
**Made HttpAcceptanceTest.rejectWithoutClientCertificate accept SocketException or SSLHandshakeException as these are both thrown depending on platform.**
 
 
[c1e40d51d7e5bd1](https://github.com/tomakehurst/wiremock/commit/c1e40d51d7e5bd1) Tom Akehurst *2015-02-24 13:35:54*
 
**Got HTTPS faults working**
 
 
[1b6dc573d4cfa88](https://github.com/tomakehurst/wiremock/commit/1b6dc573d4cfa88) Tom Akehurst *2015-02-21 21:36:29*
 
**WIP**
 
 
[46d00f5a3debc7b](https://github.com/tomakehurst/wiremock/commit/46d00f5a3debc7b) Tom Akehurst *2015-02-21 14:13:15*
 
**Making some progress fixing fault injection**
 
 
[6090b00c88b53db](https://github.com/tomakehurst/wiremock/commit/6090b00c88b53db) Tom Akehurst *2015-02-18 17:31:17*
 
**Deleting accidentally committed test**
 
 
[0eafdf87b11fda2](https://github.com/tomakehurst/wiremock/commit/0eafdf87b11fda2) Robert Elliot *2015-01-05 20:53:30*
 
**Putting HandlerDispatchingServlet back in jetty specific package as it depends on the jetty specific request adapter.**
 
 
[3e2a8fa3c462743](https://github.com/tomakehurst/wiremock/commit/3e2a8fa3c462743) Robert Elliot *2014-10-14 23:40:34*
 
**Reinstating fault logic lost in the merge.**
 
 
[c12a6c0905804c1](https://github.com/tomakehurst/wiremock/commit/c12a6c0905804c1) Robert Elliot *2014-10-14 23:36:54*
 
**Reinstating fault logic lost in the merge.**
 
 
[a919b0a28d500b5](https://github.com/tomakehurst/wiremock/commit/a919b0a28d500b5) Robert Elliot *2014-10-14 23:36:21*
 
**Added faults to Jetty 9 - delay before accepting connection and closes connection before sending response.**
 
 
[e941d8053be8b27](https://github.com/tomakehurst/wiremock/commit/e941d8053be8b27) Robert Elliot *2014-10-14 22:44:06*
 
**Fixed merge on build.gradle**
 
 
[be2d27275a1cb31](https://github.com/tomakehurst/wiremock/commit/be2d27275a1cb31) Robert Elliot *2014-10-11 14:49:09*
 
**Fixed compilation broken by merge with master**
 
 
[f6c7eebb5de8ab3](https://github.com/tomakehurst/wiremock/commit/f6c7eebb5de8ab3) Robert Elliot *2014-09-08 20:55:11*
 
**Migrated to Jetty 9. Fault behaviour does not work - failing tests.**
 
 
[50051d9d3a6ee69](https://github.com/tomakehurst/wiremock/commit/50051d9d3a6ee69) Robert Elliot *2014-09-04 07:01:27*
 
 
## 1.57
### No issue
 
**Upgraded to latest dependency versions for all prod dependencies except JSONPath (which would bring in a breaking change). Bumped version to 1.57.**
 
 
[6c178d7b781cca7](https://github.com/tomakehurst/wiremock/commit/6c178d7b781cca7) Tom Akehurst *2015-07-23 20:56:01*
 
**Adds urlPathPattern tests and documentation**
 
 
[f22ea78250208f2](https://github.com/tomakehurst/wiremock/commit/f22ea78250208f2) Emma Burrows *2015-07-20 10:54:48*
 
**Adds urlPathPattern matching strategy**
 
 
[b716c9fd6839c86](https://github.com/tomakehurst/wiremock/commit/b716c9fd6839c86) Emma Burrows *2015-07-20 10:20:10*
 
**allow specifying response body as JSON**
 
 
[cea6bf2d6d438c1](https://github.com/tomakehurst/wiremock/commit/cea6bf2d6d438c1) mike castleman *2015-06-12 16:00:51*
 
**allow using single quotes for quoting Strings in JSON files**
 
 
[d07a70cb811d54a](https://github.com/tomakehurst/wiremock/commit/d07a70cb811d54a) Kamil Szymanski *2015-06-05 10:46:30*
 
 
## 1.56
### GitHub [#266](https://github.com/tomakehurst/wiremock/issues/266) Feature Request: Command to reset only the request log.  
 
**[#266] Docs for resetting request log**
 
 
[a3ff2e09d307e17](https://github.com/tomakehurst/wiremock/commit/a3ff2e09d307e17) Christopher Batey *2015-05-10 20:03:45*
 
**[#266] Adding ability to reset just the request log**
 
 
[e8303a5f6f5a55a](https://github.com/tomakehurst/wiremock/commit/e8303a5f6f5a55a) Christopher Batey *2015-05-10 20:03:22*
 
 
### No issue
 
**Bumped version**
 
 
[80a7dbdeb09ef17](https://github.com/tomakehurst/wiremock/commit/80a7dbdeb09ef17) Tom Akehurst *2015-05-27 21:16:14*
 
**Added support for namespaces when matching request bodies by XPath. With thanks to @wdebeau1.**
 
 
[975d23e3497a97a](https://github.com/tomakehurst/wiremock/commit/975d23e3497a97a) Tom Akehurst *2015-05-19 20:45:09*
 
**Removes randomness from very long header test as this causes some instability on JDK7**
 
 
[90b0596f8897f3b](https://github.com/tomakehurst/wiremock/commit/90b0596f8897f3b) Tom Akehurst *2015-05-09 08:54:42*
 
**Avoids NPE when matching query parameters that were absent in the request**
 
 
[7333adca643aff7](https://github.com/tomakehurst/wiremock/commit/7333adca643aff7) Claudius Boettcher *2015-05-07 15:22:52*
 
**Adds test for failing query-param verification that passes with undesirable cause: NPE**
 
 
[feaacbb827061c4](https://github.com/tomakehurst/wiremock/commit/feaacbb827061c4) Claudius Boettcher *2015-05-07 15:20:46*
 
**Include trailing port information in host header when proxying.**
 
 
[6b1e110cdee78b8](https://github.com/tomakehurst/wiremock/commit/6b1e110cdee78b8) Nils Christian Haugen *2015-04-24 19:21:41*
 
**Adds the ability to work with arbitrary HTTP method/verb names, not just the usual GET/POST/PUT etc. ones.**
 
 
[7838f14e389bc0a](https://github.com/tomakehurst/wiremock/commit/7838f14e389bc0a) Robert Elliot *2015-04-21 12:26:27*
 
 
## 1.55
### Jira UTF-8   
 
**Fixed LoggedRequest body encoding. Now uses UTF-8 explicitly.**
 
 
[6ef8689fc5993f4](https://github.com/tomakehurst/wiremock/commit/6ef8689fc5993f4) Quenio dos Santos *2015-04-19 20:17:07*
 
 
### No issue
 
**Bumped version to 1.55**
 
 
[6ca5396adb4b026](https://github.com/tomakehurst/wiremock/commit/6ca5396adb4b026) Tom Akehurst *2015-04-19 20:37:37*
 
**Added OpenJDK 6 to the Travis config**
 
 
[49395d4f872b287](https://github.com/tomakehurst/wiremock/commit/49395d4f872b287) Tom Akehurst *2015-04-19 20:25:26*
 
**Some typos in Sphinx docs fixed.**
 
 
[33bf2a4e19bcd42](https://github.com/tomakehurst/wiremock/commit/33bf2a4e19bcd42) KaiHofstetter *2015-04-18 17:49:06*
 
**Updated the README with some notes on questions and contributions**
 
 
[2dba55c875b9645](https://github.com/tomakehurst/wiremock/commit/2dba55c875b9645) Tom Akehurst *2015-03-29 14:59:21*
 
**Simplified adding of CORS header in BasicResponseRenderer**
 
 
[3ea544993cbe14a](https://github.com/tomakehurst/wiremock/commit/3ea544993cbe14a) Tom Akehurst *2015-03-29 14:10:56*
 
**Add CORS header to Admin requests**
 
 * Allows JavaScript clients to stage, reset, etc. without getting 
 * Cross Site Scripting Errors. 
 * See: http://en.wikipedia.org/wiki/Cross-origin_resource_sharing 
 
[bc67dfcdb3e5598](https://github.com/tomakehurst/wiremock/commit/bc67dfcdb3e5598) Todd Ricker *2015-03-10 22:46:42*
 
**Added basic acceptance tests for configuring a fixed response delay.**
 
 
[8c376b2e5f11f2f](https://github.com/tomakehurst/wiremock/commit/8c376b2e5f11f2f) Claudius Boettcher *2015-03-10 17:51:52*
 
**Changed response renderer and servlet to shutdown gracefully when jetty is stopped during a fixed response delay sleep**
 
 
[06d1dd3bf358ba3](https://github.com/tomakehurst/wiremock/commit/06d1dd3bf358ba3) Claudius Boettcher *2015-03-10 17:51:17*
 
**CLI flag to set Jetty's request header buffer size**
 
 * My apps have very large Headers which were overflowing Jetty&#39;s 
 * Request Header Buffer, this resulted in response: 413 FULL head 
 * This patch adds the ability to specify a Jetty Header Buffer 
 * Size as a CLI flag when starting standalone Wiremock. 
 * To recreate the problem do any GET with a single header larger 
 * than 9k or so.  I added an acceptance test that demonstrates the 
 * problem. 
 * Also added console output confirmation when Jetty related command 
 * line flags are specified (there are 3 now total). They previously 
 * weren&#39;t output even when applied which leads to confusion. 
 
[b2a1d80b0dc0fb5](https://github.com/tomakehurst/wiremock/commit/b2a1d80b0dc0fb5) Todd Ricker *2015-03-09 19:26:19*
 
**Fixed POM signing in build (broken by Gradle 2.0 upgrade)**
 
 
[fdd918e046883ab](https://github.com/tomakehurst/wiremock/commit/fdd918e046883ab) Tom Akehurst *2015-03-08 19:00:23*
 
 
## 1.54
### No issue
 
**Bumped version**
 
 
[fb3989a37bc707d](https://github.com/tomakehurst/wiremock/commit/fb3989a37bc707d) Tom Akehurst *2015-03-08 17:33:55*
 
**Acceptance test illustrating the issue.**
 
 
[d9b2c53bc92aecf](https://github.com/tomakehurst/wiremock/commit/d9b2c53bc92aecf) Zoran Regvart *2015-03-05 19:41:36*
 
**ResponseDefinition now only indicates body file if body content absent. This is to make it easier for people writing ResponseTransformers and mutating the response def in order to do e.g. templating, as previously the file would win even if the transformer had added a body.**
 
 
[18b5fa13430ed2f](https://github.com/tomakehurst/wiremock/commit/18b5fa13430ed2f) Tom Akehurst *2015-02-24 14:34:38*
 
**Added new SSL cert into the keystore with a longer validity interval**
 
 
[fe6b6a72ff7d657](https://github.com/tomakehurst/wiremock/commit/fe6b6a72ff7d657) Tom Akehurst *2015-02-24 14:01:47*
 
**Fixed bug causing NPE to be thrown when expected query parameter is absent from request**
 
 
[026ff487e244d2c](https://github.com/tomakehurst/wiremock/commit/026ff487e244d2c) Tom Akehurst *2015-02-21 16:06:28*
 
**Added Google verification page for Webmaster Tools**
 
 
[8546332be0ad964](https://github.com/tomakehurst/wiremock/commit/8546332be0ad964) Tom Akehurst *2015-02-13 16:09:48*
 
**added travis-ci configuration file; updated README to include CI badge; updated gradle build configuration to disallow signing unless archiving**
 
 
[d0625e8f39c5454](https://github.com/tomakehurst/wiremock/commit/d0625e8f39c5454) R. Michael Rogers *2015-02-13 05:24:04*
 
**Fix binary data corruption when proxying requests**
 
 
[797c883b133be17](https://github.com/tomakehurst/wiremock/commit/797c883b133be17) Zoran Regvart *2015-02-04 14:54:26*
 
**Fixed bug with CLI - keystore not correctly defaulted when not specified**
 
 
[f684dcd6ffddc71](https://github.com/tomakehurst/wiremock/commit/f684dcd6ffddc71) Tom Akehurst *2015-02-02 09:55:56*
 
**Made remaining acceptance tests bind to random ports**
 
 
[cfee8fb1c558de1](https://github.com/tomakehurst/wiremock/commit/cfee8fb1c558de1) Tom Akehurst *2015-01-11 20:54:42*
 
**Removed port() from Admin and WireMock (as both can be local and won't necessarily have a port associated)**
 
 
[d348941b16fe71a](https://github.com/tomakehurst/wiremock/commit/d348941b16fe71a) Tom Akehurst *2015-01-11 19:53:05*
 
**Removed redundant findFreePort imports**
 
 
[6be93092afb86ab](https://github.com/tomakehurst/wiremock/commit/6be93092afb86ab) Tom Akehurst *2015-01-11 19:40:14*
 
**[gus] modified tests to use dynamic port allocation**
 
 
[5d55cfe2838f842](https://github.com/tomakehurst/wiremock/commit/5d55cfe2838f842) Gus Power *2015-01-06 17:16:44*
 
**[gus] modified tests to use dynamic port allocation**
 
 
[457e351c2cebf09](https://github.com/tomakehurst/wiremock/commit/457e351c2cebf09) Gus Power *2015-01-06 15:27:06*
 
**Fixed JAR download version in docs**
 
 
[fef94a6a2eff375](https://github.com/tomakehurst/wiremock/commit/fef94a6a2eff375) Tom Akehurst *2015-01-02 18:05:55*
 
**Fixed bump version logic**
 
 
[9969df67611d5b9](https://github.com/tomakehurst/wiremock/commit/9969df67611d5b9) Tom Akehurst *2015-01-02 18:05:36*
 
**Added docs for extensions**
 
 
[842724a2bfef9cf](https://github.com/tomakehurst/wiremock/commit/842724a2bfef9cf) Tom Akehurst *2015-01-02 09:00:35*
 
**Updated docs**
 
 
[808cfc7a4df4362](https://github.com/tomakehurst/wiremock/commit/808cfc7a4df4362) Tom Akehurst *2015-01-02 08:21:40*
 
**Adding docs for jetty options**
 
 
[8444c6d1defabdd](https://github.com/tomakehurst/wiremock/commit/8444c6d1defabdd) Christopher Batey *2015-01-02 00:05:51*
 
 
## 1.53
### GitHub [#193](https://github.com/tomakehurst/wiremock/issues/193) NullPointerException using a valid WireMockServer constructor in version 1.52  
 
**Fix for issue #193 causing NPE to be thrown when recording enabled programmatically**
 
 
[22a7b08e8c7ced7](https://github.com/tomakehurst/wiremock/commit/22a7b08e8c7ced7) Tom Akehurst *2014-11-24 21:56:48*
 
 
### GitHub [#216](https://github.com/tomakehurst/wiremock/issues/216) proxy modifies headers when calling actual webservice  
 
**Disabled content compression on the test HTTP client and Proxy HTTP client to fix #216**
 
 
[ec8ae4bf6a46ae2](https://github.com/tomakehurst/wiremock/commit/ec8ae4bf6a46ae2) Tom Akehurst *2015-01-01 21:08:29*
 
 
### GitHub [#219](https://github.com/tomakehurst/wiremock/issues/219) Expose more of Jetty&#39;s tuning options  
 
**#219 setting jetting settings on connector + making them optional**
 
 
[4bc36e514aa7d0f](https://github.com/tomakehurst/wiremock/commit/4bc36e514aa7d0f) Christopher Batey *2015-12-31 23:06:10*
 
**#219 adding jetty settings to wiremock config**
 
 
[3e25e4d9ee400d9](https://github.com/tomakehurst/wiremock/commit/3e25e4d9ee400d9) Christopher Batey *2015-12-31 22:30:47*
 
**#219 adding jetty accept queue size to command line options**
 
 
[689c28c02158015](https://github.com/tomakehurst/wiremock/commit/689c28c02158015) Christopher Batey *2015-12-31 22:28:09*
 
**#219 adding jetty acceptor count to command line options**
 
 
[719bf07c0a0c181](https://github.com/tomakehurst/wiremock/commit/719bf07c0a0c181) Christopher Batey *2015-12-31 22:22:14*
 
 
### Jira HTTPCLIENT-1585   
 
**Make test dodge client cert issue**
 
 * https://issues.apache.org/jira/browse/HTTPCLIENT-1585 
 
[d17ba4bce45b6e4](https://github.com/tomakehurst/wiremock/commit/d17ba4bce45b6e4) Jim Scarborough *2014-12-04 16:08:26*
 
 
### No issue
 
**Bumped version**
 
 
[06b70896bd18c72](https://github.com/tomakehurst/wiremock/commit/06b70896bd18c72) Tom Akehurst *2015-01-01 20:35:33*
 
**Fixed merge conflicts**
 
 
[2bcf19b4e5be9fa](https://github.com/tomakehurst/wiremock/commit/2bcf19b4e5be9fa) Tom Akehurst *2015-12-31 18:13:07*
 
**Added the __file FileSource to ResponseTransformer method parameters so that body files can be read**
 
 
[24521fb10c58274](https://github.com/tomakehurst/wiremock/commit/24521fb10c58274) Tom Akehurst *2015-12-31 17:57:28*
 
**Added Admin interface to WireMockServer**
 
 
[0dd863f7455b3bf](https://github.com/tomakehurst/wiremock/commit/0dd863f7455b3bf) Tom Akehurst *2015-12-31 14:47:20*
 
**Removed ability to set proxyUrl in programmatic configuration to avoid confusion**
 
 
[e0c9c5ccf6421a4](https://github.com/tomakehurst/wiremock/commit/e0c9c5ccf6421a4) Tom Akehurst *2015-12-31 14:33:30*
 
**Simplifications, tidy-up and name tweaks for request journal limiting**
 
 
[6b2dcd9583d23dd](https://github.com/tomakehurst/wiremock/commit/6b2dcd9583d23dd) Tom Akehurst *2015-12-31 11:31:27*
 
**Added extensions to CLI**
 
 
[8ea684f14e87519](https://github.com/tomakehurst/wiremock/commit/8ea684f14e87519) Tom Akehurst *2015-12-30 21:33:17*
 
**Added test for duplicate extension name checking**
 
 
[d99107cfbb8267f](https://github.com/tomakehurst/wiremock/commit/d99107cfbb8267f) Tom Akehurst *2015-12-30 21:16:04*
 
**Added ability to specify a response transform per stub mapping**
 
 
[ac1fbc33ef847ef](https://github.com/tomakehurst/wiremock/commit/ac1fbc33ef847ef) Tom Akehurst *2015-12-30 21:06:58*
 
**Making the number of container threads configurable.**
 
 
[4b51bdc69cd0e81](https://github.com/tomakehurst/wiremock/commit/4b51bdc69cd0e81) Christopher Batey *2015-12-29 21:35:58*
 
**Removed possibility to resize request journal dynamically. Has to be added again when dynamic resizing is implemented**
 
 
[7225d08fec234c3](https://github.com/tomakehurst/wiremock/commit/7225d08fec234c3) Christian Amann *2015-12-29 12:24:09*
 
**Added ability to specify whether a response transformer is applied globally**
 
 
[0ab130d5ebf6f4f](https://github.com/tomakehurst/wiremock/commit/0ab130d5ebf6f4f) Tom Akehurst *2014-12-28 18:49:01*
 
**Changed extensions data structure to a map**
 
 
[9a4e01b6251597f](https://github.com/tomakehurst/wiremock/commit/9a4e01b6251597f) Tom Akehurst *2014-12-28 11:53:26*
 
**Added support for multiple transformers and specifying transformers by class or instance**
 
 
[5a6e9279c9a74b1](https://github.com/tomakehurst/wiremock/commit/5a6e9279c9a74b1) Tom Akehurst *2014-12-28 11:13:55*
 
**Initial pass at adding response transformer extension point**
 
 
[5db3c2b4e624a63](https://github.com/tomakehurst/wiremock/commit/5db3c2b4e624a63) Tom Akehurst *2014-12-27 12:19:37*
 
**Added support for proxying to services requiring a client certificate**
 
 
[7bc3549788e9e83](https://github.com/tomakehurst/wiremock/commit/7bc3549788e9e83) Tom Akehurst *2014-12-26 15:21:37*
 
**Added option for truststore password**
 
 
[65bdf91411b2393](https://github.com/tomakehurst/wiremock/commit/65bdf91411b2393) Tom Akehurst *2014-12-26 12:03:19*
 
**Added option for keystore password**
 
 
[3955e38fa033a87](https://github.com/tomakehurst/wiremock/commit/3955e38fa033a87) Tom Akehurst *2014-12-25 17:24:48*
 
**polish**
 
 
[5b18ada98597129](https://github.com/tomakehurst/wiremock/commit/5b18ada98597129) Jim Scarborough *2014-12-15 20:36:19*
 
**Fixed broken test in HttpsAcceptanceTest**
 
 
[39d6574e6331ab5](https://github.com/tomakehurst/wiremock/commit/39d6574e6331ab5) Oleg Kalnichevski *2014-12-15 20:18:26*
 
**Add command line support for client certs**
 
 
[76a0acefc10231a](https://github.com/tomakehurst/wiremock/commit/76a0acefc10231a) Jim Scarborough *2014-12-15 20:07:25*
 
**Oops, forgot that the request log is already a ConcurrentLinkedQueue**
 
 
[81ca32c9d944e31](https://github.com/tomakehurst/wiremock/commit/81ca32c9d944e31) Christian Amann *2014-12-11 13:47:28*
 
**Remove possibility for race condition to occur when adding/clearing and querying the request log at the same time**
 
 
[606fc05ca2b697f](https://github.com/tomakehurst/wiremock/commit/606fc05ca2b697f) Christian Amann *2014-12-11 13:44:04*
 
**Remove possibility for race condition to occur when setting the value while getting/checking it**
 
 
[8659a60e228f9a7](https://github.com/tomakehurst/wiremock/commit/8659a60e228f9a7) Christian Amann *2014-12-11 13:34:42*
 
**Replace null values for request journal max size with optionals**
 
 
[0e0ec1eabbfac59](https://github.com/tomakehurst/wiremock/commit/0e0ec1eabbfac59) Christian Amann *2014-12-11 13:25:31*
 
**Add comments to Options interface**
 
 
[b07af66804c814e](https://github.com/tomakehurst/wiremock/commit/b07af66804c814e) Christian Amann *2014-12-11 12:50:04*
 
**Added exclusions to Maven standalone config example in docs**
 
 
[8126a46b0e304cc](https://github.com/tomakehurst/wiremock/commit/8126a46b0e304cc) Tom Akehurst *2014-11-22 20:24:01*
 
**Updated docs**
 
 
[027054893c8b219](https://github.com/tomakehurst/wiremock/commit/027054893c8b219) Tom Akehurst *2014-11-22 20:09:38*
 
**Added doc note about adding headers when proxying**
 
 
[c2994b99780d8c8](https://github.com/tomakehurst/wiremock/commit/c2994b99780d8c8) Tom Akehurst *2014-11-22 18:43:02*
 
**Renamed injectedHeaders to additionalRequestHeaders when adding request headers to proxy stubs, and made corresponding ResponseDefinitionBuilder calls typesafe (can only be called after proxiedFrom(...).**
 
 
[e9c602bc0683f38](https://github.com/tomakehurst/wiremock/commit/e9c602bc0683f38) Tom Akehurst *2014-11-22 18:29:20*
 
**Add support for requiring client certificates**
 
 * Work remains: 
 * Remove the client test after fixing it from failing intermittently) 
 * Verify that the accepting client certificate test no longer fails intermittently 
 * Add command line configuration option for client certificate 
 
[69d7f20ca667e80](https://github.com/tomakehurst/wiremock/commit/69d7f20ca667e80) Jim Scarborough *2014-11-19 19:29:53*
 
**implemented inject headers**
 
 
[38bb55edc77cecc](https://github.com/tomakehurst/wiremock/commit/38bb55edc77cecc) Jonas Nordstrand *2014-11-18 22:51:35*
 
**Change formatting (tabs)**
 
 
[ebd4fc4a5b48206](https://github.com/tomakehurst/wiremock/commit/ebd4fc4a5b48206) Christian Amann *2014-10-31 10:19:51*
 
**Make sure we close files after having read them (causes tests to fail otherwise and is generally good practice)**
 
 
[61b046e3d1041ea](https://github.com/tomakehurst/wiremock/commit/61b046e3d1041ea) Christian Amann *2014-10-31 10:12:58*
 
**Add possibility to restrict the request log to a specific maximum length. If the log is too long old entries are discarded**
 
 
[c58da2575bdf1d3](https://github.com/tomakehurst/wiremock/commit/c58da2575bdf1d3) Christian Amann *2014-10-31 10:04:18*
 
**Re-worked query parameter matching to support multi-valued params and fixed a related bug causing IllegalArgumentExceptions to be thrown when query param values contain =**
 
 
[bf80301cd078d68](https://github.com/tomakehurst/wiremock/commit/bf80301cd078d68) Tom Akehurst *2014-10-28 15:24:51*
 
**Refactoring to make the Rule classes children of WireMockServer, eliminating lots of delegation and duplication**
 
 
[8f4524d42faf25f](https://github.com/tomakehurst/wiremock/commit/8f4524d42faf25f) Tom Akehurst *2014-10-27 19:12:33*
 
**Added the Stubbing interface to WireMockServer. Now makes admin calls locally if going via the rule or WireMockServer.**
 
 
[0924bf11217d76f](https://github.com/tomakehurst/wiremock/commit/0924bf11217d76f) Tom Akehurst *2014-10-27 19:05:10*
 
**Bumped version**
 
 
[f8da7ca4df71453](https://github.com/tomakehurst/wiremock/commit/f8da7ca4df71453) Tom Akehurst *2014-10-27 18:26:37*
 
 
## 1.52-beta
### No issue
 
**Excluded Connection from headers transferred when proxying**
 
 
[5d41880c3f6adc1](https://github.com/tomakehurst/wiremock/commit/5d41880c3f6adc1) Tom Akehurst *2014-10-23 21:27:42*
 
**Moved WireMockTest client to HttpClientBuilder. Removed calls to deprecated code.**
 
 
[c3c06e1147c8a52](https://github.com/tomakehurst/wiremock/commit/c3c06e1147c8a52) Tom Akehurst *2014-10-23 18:39:30*
 
**Switched to using HttpClientBuilder for the proxy client. Disabled session persistence to avoid cookie duplication bug when proxying. Added some extra tests.**
 
 
[40edbaaec29dee0](https://github.com/tomakehurst/wiremock/commit/40edbaaec29dee0) Tom Akehurst *2014-10-23 18:00:50*
 
**Added the gradle wrapper (had been excluded in .gitignore)**
 
 
[713c2d4eeb12652](https://github.com/tomakehurst/wiremock/commit/713c2d4eeb12652) Tom Akehurst *2014-10-18 09:33:56*
 
**Added an additional query param test. Documented query parameter and URL path matching.**
 
 
[c74e06ae5f1f7a3](https://github.com/tomakehurst/wiremock/commit/c74e06ae5f1f7a3) Tom Akehurst *2014-10-14 17:33:47*
 
**Added matching on URL path and query parameters**
 
 
[cb8952ab30d2293](https://github.com/tomakehurst/wiremock/commit/cb8952ab30d2293) Tom Akehurst *2014-10-14 17:15:36*
 
**Refactor to move Jetty 6 specific code (fault injection, browser proxy request detection) under the jetty6 package (renamed from jetty). Also some renaming of existing Jetty-specific classes to Jetty6***
 
 
[704bd50a89dd356](https://github.com/tomakehurst/wiremock/commit/704bd50a89dd356) Tom Akehurst *2014-10-11 20:02:15*
 
**Removed log4j. Added logging to slf4j (API only, no impl). Standlone logs directly to stdout and stderr. Prettified standalone startup output.**
 
 
[14e0970cbc50d75](https://github.com/tomakehurst/wiremock/commit/14e0970cbc50d75) Tom Akehurst *2014-10-11 16:22:17*
 
**Added zip file used for ClasspathFileSource testing (erroneously git ignored)**
 
 
[cab93395b4f5f39](https://github.com/tomakehurst/wiremock/commit/cab93395b4f5f39) Tom Akehurst *2014-10-11 15:04:26*
 
**Can now add extra headers to proxied responses**
 
 
[33c31faf7316cdd](https://github.com/tomakehurst/wiremock/commit/33c31faf7316cdd) TobiasO *2014-10-11 14:04:07*
 
**Merging with upstream/master**
 
 
[dd2629734dc65df](https://github.com/tomakehurst/wiremock/commit/dd2629734dc65df) Robert Elliot *2014-09-08 20:47:57*
 
**Code cleanup around isolating Jetty code**
 
 
[63d8b24e6166404](https://github.com/tomakehurst/wiremock/commit/63d8b24e6166404) Robert Elliot *2014-08-10 20:59:34*
 
**Refactored all Jetty specific code into a single package and put it behind interfaces as a first step towards making the servlet engine pluggable.**
 
 
[ddcdf1f0604fc19](https://github.com/tomakehurst/wiremock/commit/ddcdf1f0604fc19) Robert Elliot *2014-08-10 18:45:08*
 
**Made build work when sonatypeUser and sonatypePassword are not present - used to blow up**
 
 
[368562e5382de4c](https://github.com/tomakehurst/wiremock/commit/368562e5382de4c) Robert Elliot *2014-08-10 18:44:15*
 
 
## 1.51
### No issue
 
**Bumped version**
 
 
[544ca79363ac377](https://github.com/tomakehurst/wiremock/commit/544ca79363ac377) Tom Akehurst *2014-10-05 20:27:41*
 
**ClasspathFileSource will now attempt to read zip files when the URI scheme is zip, war or ear (in addition to jar)**
 
 
[5340994c6deff87](https://github.com/tomakehurst/wiremock/commit/5340994c6deff87) Tom Akehurst *2014-10-05 20:27:13*
 
**Upgraded most dependencies to latest versions**
 
 
[3759007997e40b2](https://github.com/tomakehurst/wiremock/commit/3759007997e40b2) Tom Akehurst *2014-09-29 16:18:56*
 
 
## 1.50
### No issue
 
**Bumped version**
 
 
[aaa32b07b47467a](https://github.com/tomakehurst/wiremock/commit/aaa32b07b47467a) Tom Akehurst *2014-09-28 10:40:16*
 
**Mapping recorder now matches request body on JSON or XML if these are found in the Content-Type header**
 
 
[ecbd3e4988021c1](https://github.com/tomakehurst/wiremock/commit/ecbd3e4988021c1) Tom Akehurst *2014-09-28 10:39:44*
 
**Added extra config DSL methods for file sources and a test case for class path file source**
 
 
[bfe6930f407b98c](https://github.com/tomakehurst/wiremock/commit/bfe6930f407b98c) Tom Akehurst *2014-09-28 09:57:01*
 
**Now logs request bodies in verbose mode**
 
 
[1b32e9dc2f3671c](https://github.com/tomakehurst/wiremock/commit/1b32e9dc2f3671c) Tom Akehurst *2014-09-28 09:39:32*
 
**Now supports file sources inside archive (e.g. JAR) files via ClasspathFileSource**
 
 
[7fe82140a2fce5e](https://github.com/tomakehurst/wiremock/commit/7fe82140a2fce5e) Tom Akehurst *2014-09-27 20:34:51*
 
 
## 1.48
### No issue
 
**Bumped version**
 
 
[21211a6a68b2892](https://github.com/tomakehurst/wiremock/commit/21211a6a68b2892) Tom Akehurst *2014-09-08 19:56:23*
 
**Allow wiremock servlets to be mapped at a different path than / in the current context.**
 
 
[dc708118b735686](https://github.com/tomakehurst/wiremock/commit/dc708118b735686) Christian Amann *2014-09-08 19:54:02*
 
**Now exits with a 1 when an exception is thrown from Jetty startup (e.g. port clash)**
 
 
[a21e9a778a9b22a](https://github.com/tomakehurst/wiremock/commit/a21e9a778a9b22a) Tom Akehurst *2014-09-08 09:16:50*
 
**Removed configuration singleton (injected relevant values directly into ProxyResponseRenderer), renamed some config attributes.**
 
 
[73e1230f6994c3e](https://github.com/tomakehurst/wiremock/commit/73e1230f6994c3e) Tom Akehurst *2014-09-07 11:03:27*
 
**Added the preserve-host-header option when running in proxy mode**
 
 
[9965b014f16bbfb](https://github.com/tomakehurst/wiremock/commit/9965b014f16bbfb) Andrés Di Falco *2014-09-04 19:26:54*
 
**Make it possible to register StubMapping**
 
 
[c251b7082652e58](https://github.com/tomakehurst/wiremock/commit/c251b7082652e58) Kamil Szymanski *2014-08-13 20:50:52*
 
 
## 1.47
### Jira iso-8859   
 
**Fixed a character encoding bug causing request bodies to be read as iso-8859-1 instead of utf-8**
 
 
[b07b64520765f7c](https://github.com/tomakehurst/wiremock/commit/b07b64520765f7c) Tom Akehurst *2014-07-31 20:44:05*
 
**Fixed a character encoding bug causing request bodies to be read as iso-8859-1 instead of utf-8**
 
 
[cac5947eec41a0e](https://github.com/tomakehurst/wiremock/commit/cac5947eec41a0e) Tom Akehurst *2014-07-26 20:28:46*
 
 
### Jira utf-8   
 
**Fixed a character encoding bug causing request bodies to be read as iso-8859-1 instead of utf-8**
 
 
[b07b64520765f7c](https://github.com/tomakehurst/wiremock/commit/b07b64520765f7c) Tom Akehurst *2014-07-31 20:44:05*
 
**Fixed a character encoding bug causing request bodies to be read as iso-8859-1 instead of utf-8**
 
 
[cac5947eec41a0e](https://github.com/tomakehurst/wiremock/commit/cac5947eec41a0e) Tom Akehurst *2014-07-26 20:28:46*
 
 
### No issue
 
**Bumped version**
 
 
[72662c0f78002ca](https://github.com/tomakehurst/wiremock/commit/72662c0f78002ca) Tom Akehurst *2014-08-02 11:37:31*
 
**Fixed documentation bug - headers can't be matched on twice**
 
 
[3d0083ba5ebee8d](https://github.com/tomakehurst/wiremock/commit/3d0083ba5ebee8d) Tom Akehurst *2014-07-31 21:01:47*
 
**Added a test for PATCH proxying**
 
 
[194e4140a341eaa](https://github.com/tomakehurst/wiremock/commit/194e4140a341eaa) Tom Akehurst *2014-07-31 20:49:17*
 
**Removed recording header matching parameters from Admin interface (now passed straight from Options into StubMappingsJsonRecorder constructor). Removed need for separate boolean for enabling request header recording. Made header matching case insensitive.**
 
 
[fcb6f7731c88d86](https://github.com/tomakehurst/wiremock/commit/fcb6f7731c88d86) Tom Akehurst *2014-07-31 20:44:05*
 
**Added ability to do XPath matching using XMLUnit.assertXpathExists**
 
 
[adfc0fc18c72195](https://github.com/tomakehurst/wiremock/commit/adfc0fc18c72195) David Smith *2014-07-31 20:44:05*
 
**Added new command line option**
 
 
[9ccc70a2603ee23](https://github.com/tomakehurst/wiremock/commit/9ccc70a2603ee23) Julian Vergel de Dios *2014-07-31 20:44:05*
 
**Documented --match-header in record/playback**
 
 
[96f559e42511e4c](https://github.com/tomakehurst/wiremock/commit/96f559e42511e4c) Tom Akehurst *2014-07-31 20:44:05*
 
**Added missing copyright header**
 
 
[56d1ca559b9289f](https://github.com/tomakehurst/wiremock/commit/56d1ca559b9289f) Tom Akehurst *2014-07-31 20:44:05*
 
**Tweaked some method and attribute names in XPath matching. Added a couple of additional tests for error cases. Added better error reporting.**
 
 
[48d38bb396f737d](https://github.com/tomakehurst/wiremock/commit/48d38bb396f737d) Tom Akehurst *2014-07-31 20:44:05*
 
**First pass using header matching parameter**
 
 
[31dde40d113132a](https://github.com/tomakehurst/wiremock/commit/31dde40d113132a) Julian Vergel de Dios *2014-07-31 20:44:05*
 
**Added stub mapping recording test for headers**
 
 
[1f6009849c5f299](https://github.com/tomakehurst/wiremock/commit/1f6009849c5f299) Julian Vergel de Dios *2014-07-31 20:44:05*
 
**Added acceptance test for matching headers**
 
 
[058ed5cb86e1053](https://github.com/tomakehurst/wiremock/commit/058ed5cb86e1053) Julian Vergel de Dios *2014-07-31 20:44:05*
 
**Added missing copyright header**
 
 
[06099afb46bb218](https://github.com/tomakehurst/wiremock/commit/06099afb46bb218) Tom Akehurst *2014-07-27 20:44:38*
 
**Documented --match-header in record/playback**
 
 
[c67ee8fd45ff29c](https://github.com/tomakehurst/wiremock/commit/c67ee8fd45ff29c) Tom Akehurst *2014-07-27 20:36:10*
 
**Removed recording header matching parameters from Admin interface (now passed straight from Options into StubMappingsJsonRecorder constructor). Removed need for separate boolean for enabling request header recording. Made header matching case insensitive.**
 
 
[671d2603a1765dc](https://github.com/tomakehurst/wiremock/commit/671d2603a1765dc) Tom Akehurst *2014-07-27 20:01:33*
 
**Tweaked some method and attribute names in XPath matching. Added a couple of additional tests for error cases. Added better error reporting.**
 
 
[f8e199c115d53dc](https://github.com/tomakehurst/wiremock/commit/f8e199c115d53dc) Tom Akehurst *2014-07-26 22:03:50*
 
**Fix for PATCH not proxying request body**
 
 
[5fc85f0890ce5f6](https://github.com/tomakehurst/wiremock/commit/5fc85f0890ce5f6) Julian Vergel de Dios *2014-07-25 22:03:49*
 
**Fix for missing PATCH method when rendering proxied responses**
 
 
[279c5526473f1a4](https://github.com/tomakehurst/wiremock/commit/279c5526473f1a4) Julian Vergel de Dios *2014-07-23 01:53:18*
 
**Added acceptance test for matching headers**
 
 
[732a0db14c9174b](https://github.com/tomakehurst/wiremock/commit/732a0db14c9174b) Julian Vergel de Dios *2014-07-20 21:57:35*
 
**Added stub mapping recording test for headers**
 
 
[73fbb0f1d53f2b1](https://github.com/tomakehurst/wiremock/commit/73fbb0f1d53f2b1) Julian Vergel de Dios *2014-07-20 21:13:57*
 
**First pass using header matching parameter**
 
 
[78cdddb695af8fc](https://github.com/tomakehurst/wiremock/commit/78cdddb695af8fc) Julian Vergel de Dios *2014-07-19 00:21:27*
 
**Added new command line option**
 
 
[9cb6c3fb3609dcc](https://github.com/tomakehurst/wiremock/commit/9cb6c3fb3609dcc) Julian Vergel de Dios *2014-07-18 23:15:42*
 
**Fixed JsonPath example**
 
 
[fbb695e38f15dcc](https://github.com/tomakehurst/wiremock/commit/fbb695e38f15dcc) Sebastian Mancke *2014-07-18 08:40:02*
 
**Adding hooks to rules to allow easier stubbing when extending WireMockRule**
 
 
[da19776547ea10c](https://github.com/tomakehurst/wiremock/commit/da19776547ea10c) Jamie Furness *2014-07-17 16:37:19*
 
**Added ability to do XPath matching using XMLUnit.assertXpathExists**
 
 
[26599ea39447204](https://github.com/tomakehurst/wiremock/commit/26599ea39447204) David Smith *2014-06-18 14:08:59*
 
**Added mailing list link**
 
 
[65af57aa1c22655](https://github.com/tomakehurst/wiremock/commit/65af57aa1c22655) Tom Akehurst *2014-05-09 14:13:41*
 
**Making verbosity of logging controllable in servlets**
 
 
[ba6efdbb0ec880e](https://github.com/tomakehurst/wiremock/commit/ba6efdbb0ec880e) Rob.Elliot *2014-04-30 14:59:22*
 
**Updated contributors section in the docs**
 
 
[9e308f3c4e6a5fb](https://github.com/tomakehurst/wiremock/commit/9e308f3c4e6a5fb) Tom Akehurst *2014-04-20 18:37:47*
 
**Upped Gradle version to 1.11**
 
 
[bc45dc8787cc2cc](https://github.com/tomakehurst/wiremock/commit/bc45dc8787cc2cc) Tom Akehurst *2014-04-14 19:10:30*
 
 
## 1.46
### No issue
 
**Fix for charset quotes parsing problem**
 
 
[a2f3eed29510b3e](https://github.com/tomakehurst/wiremock/commit/a2f3eed29510b3e) Tom Akehurst *2014-03-26 20:55:40*
 
**Bumped version**
 
 
[4a8301311bff5e9](https://github.com/tomakehurst/wiremock/commit/4a8301311bff5e9) Tom Akehurst *2014-03-26 20:46:05*
 
**Making it possible to specify the address to listen to.**
 
 * Now it&#39;s possible to pass a command line argument or a programming 
 * configuration defining the IP address the server should listen to. If none 
 * the server will listen in all interface. 
 
[db55ca487cabe1c](https://github.com/tomakehurst/wiremock/commit/db55ca487cabe1c) Diego de Oliveira *2014-03-24 22:37:20*
 
**Reset WireMock server instance between tests.**
 
 
[a760bbe418dc670](https://github.com/tomakehurst/wiremock/commit/a760bbe418dc670) Oliver Schoenherr *2014-03-22 21:06:05*
 
 
## 1.44
### No issue
 
**Changed --recordings-path command line param to --root-dir**
 
 
[f7b3fc0050bb040](https://github.com/tomakehurst/wiremock/commit/f7b3fc0050bb040) Tom Akehurst *2014-03-08 21:10:29*
 
**Bumped version**
 
 
[0571bca06821e33](https://github.com/tomakehurst/wiremock/commit/0571bca06821e33) Tom Akehurst *2014-03-08 20:48:15*
 
**Made proxy-all stub priority 10 rather than 105, with a comment to explain.**
 
 
[7e0700ba299caae](https://github.com/tomakehurst/wiremock/commit/7e0700ba299caae) Tom Akehurst *2014-03-08 20:47:40*
 
**Added XML matching to docs. Added attribute order invariance test for XML matching. Made XMLUnit setup static (since it is entirely static).**
 
 
[02f3125679674e0](https://github.com/tomakehurst/wiremock/commit/02f3125679674e0) Tom Akehurst *2014-03-08 20:23:36*
 
**Added acceptance test for XML body matching. Made case of Xml consistent with other acronyms throughout the codebase.**
 
 
[f577d90381cff27](https://github.com/tomakehurst/wiremock/commit/f577d90381cff27) Tom Akehurst *2014-03-08 19:58:09*
 
**Add support for verifying PATCH requests**
 
 
[e9a2a1d6190e029](https://github.com/tomakehurst/wiremock/commit/e9a2a1d6190e029) Rowan Hill *2014-03-08 08:21:38*
 
**File source root can now be specified as a command-line option using --recordings-path with defaults to current directory**
 
 
[d8a1d41df50d383](https://github.com/tomakehurst/wiremock/commit/d8a1d41df50d383) Aman King *2014-03-06 12:41:33*
 
**WireMockServerRunner in proxy mode now deprioritizes proxy-based stub mapping so that existing recordings are used if present; fixes issue of adding more recordings for requests recorded before startup**
 
 
[3ebf41e244a6f2e](https://github.com/tomakehurst/wiremock/commit/3ebf41e244a6f2e) Aman King *2014-03-05 12:36:56*
 
**Fail on specifying state transition without scenario**
 
 
[ac50cba6fff89e9](https://github.com/tomakehurst/wiremock/commit/ac50cba6fff89e9) Rowan Hill *2014-03-02 17:24:42*
 
**adding XML comparison method**
 
 
[4b7afb5f488e654](https://github.com/tomakehurst/wiremock/commit/4b7afb5f488e654) jgoldberg@pros.com *2014-02-18 20:41:57*
 
**Corrected download link to be 1.40**
 
 
[f2548ec4393503d](https://github.com/tomakehurst/wiremock/commit/f2548ec4393503d) paulclarkin *2014-01-20 09:34:00*
 
**Add acceptance test around requiring scenario states with no scenario name**
 
 
[7516a7f44219e20](https://github.com/tomakehurst/wiremock/commit/7516a7f44219e20) Rowan Hill *2013-12-28 11:53:09*
 
 
## 1.43
### No issue
 
**Added JSON body matching to docs**
 
 
[6f597fdf02afb62](https://github.com/tomakehurst/wiremock/commit/6f597fdf02afb62) tomakehurst *2014-02-18 18:33:20*
 
**Added setting of JSON compare mode on Java API**
 
 
[d5c56cc746a9fed](https://github.com/tomakehurst/wiremock/commit/d5c56cc746a9fed) tomakehurst *2014-02-18 18:22:52*
 
**Bumped version**
 
 
[4b761be7af19c8f](https://github.com/tomakehurst/wiremock/commit/4b761be7af19c8f) tomakehurst *2014-02-18 17:49:18*
 
**Attempt at fixing download links being broken on each version bump**
 
 
[d1ac97e247a90d5](https://github.com/tomakehurst/wiremock/commit/d1ac97e247a90d5) tomakehurst *2014-02-18 17:48:53*
 
**Added gradle wrapper**
 
 
[0963281ddd33808](https://github.com/tomakehurst/wiremock/commit/0963281ddd33808) tomakehurst *2014-02-18 17:43:21*
 
**Added ability to set JSON compare mode when matching request body on exact JSON**
 
 
[cc056b9936b23f7](https://github.com/tomakehurst/wiremock/commit/cc056b9936b23f7) tomakehurst *2014-02-18 17:39:41*
 
**Doc tweak**
 
 
[87303e140c83424](https://github.com/tomakehurst/wiremock/commit/87303e140c83424) Tom Akehurst *2014-02-06 09:01:32*
 
 
## 1.42
### GitHub [#87](https://github.com/tomakehurst/wiremock/issues/87) Hooks for notification of when a stub receives a request  
 
**Add a method `addMockServiceRequestListener` which forwards on to the underlying `WireMockServer`.**
 
 * Update the tests to cover the new method and document it so that common pitfalls are not fallen into. 
 * This fixes #87 
 
[656484e28a27825](https://github.com/tomakehurst/wiremock/commit/656484e28a27825) Matt Nathan *2014-01-09 09:50:47*
 
 
### No issue
 
**Minor style tweaks and doc update for request listener PR**
 
 
[ef2b694ed75d69a](https://github.com/tomakehurst/wiremock/commit/ef2b694ed75d69a) Tom Akehurst *2014-02-06 08:33:27*
 
 
## 1.41
### No issue
 
**Bumped version**
 
 
[37415056379fcc2](https://github.com/tomakehurst/wiremock/commit/37415056379fcc2) Tom Akehurst *2014-01-23 08:29:36*
 
**Support for PATCH HTTP method**
 
 
[d265cf315e47878](https://github.com/tomakehurst/wiremock/commit/d265cf315e47878) Rob.Elliot *2014-01-22 17:22:37*
 
 
## 1.40
### No issue
 
**Added missing copyright headers**
 
 
[ef7973981688c55](https://github.com/tomakehurst/wiremock/commit/ef7973981688c55) Tom Akehurst *2013-12-28 11:03:15*
 
**Removed jdepend from the build**
 
 
[efa5fe349e88f77](https://github.com/tomakehurst/wiremock/commit/efa5fe349e88f77) Tom Akehurst *2013-12-28 11:02:42*
 
**Fixed compile error from bad @Nullable import**
 
 
[a26c63bb065ceb1](https://github.com/tomakehurst/wiremock/commit/a26c63bb065ceb1) Tom Akehurst *2013-12-28 11:00:50*
 
**Test other unsupported servlet container operations (socket delay & shutdown)**
 
 
[a3789a7e7828dc2](https://github.com/tomakehurst/wiremock/commit/a3789a7e7828dc2) Rowan Hill *2013-12-27 11:24:03*
 
**Updated docs: saving mappings**
 
 
[73d068b68454f9e](https://github.com/tomakehurst/wiremock/commit/73d068b68454f9e) Rowan Hill *2013-12-27 11:23:15*
 
**Add support for saving registered stub mappings**
 
 
[227c09da72a8c93](https://github.com/tomakehurst/wiremock/commit/227c09da72a8c93) Rowan Hill *2013-12-27 11:23:10*
 
**Fix intermittent StandaloneAcceptanceTest#canBeShutDownRemote() test**
 
 
[b7f7340b18d20ff](https://github.com/tomakehurst/wiremock/commit/b7f7340b18d20ff) Rowan Hill *2013-12-26 19:04:16*
 
**Bumped version. Updated tests for compatibility to JUnit 4.11 and updated the docs to indicate how to use with @Rules JUnit 4.11**
 
 
[dd3f02e4a3076c7](https://github.com/tomakehurst/wiremock/commit/dd3f02e4a3076c7) Tom Akehurst *2013-12-26 16:51:45*
 
**Fixed bug preventing query params being sent when browser proxying**
 
 
[d0ecefe6b8d62c0](https://github.com/tomakehurst/wiremock/commit/d0ecefe6b8d62c0) Tom Akehurst *2013-12-26 15:33:40*
 
**Updated docs: remote shutting down**
 
 
[d8252a636ba5a30](https://github.com/tomakehurst/wiremock/commit/d8252a636ba5a30) Rowan Hill *2013-12-26 11:35:51*
 
**Support shutting down on POST to /__admin/shutdown**
 
 
[95b562f90f2fabb](https://github.com/tomakehurst/wiremock/commit/95b562f90f2fabb) Rowan Hill *2013-12-26 11:35:51*
 
**Add test to prove WireMockRule as @Rule resets server between tests**
 
 
[3a04b905a5d2a10](https://github.com/tomakehurst/wiremock/commit/3a04b905a5d2a10) Rowan Hill *2013-12-24 22:19:25*
 
 
## 1.39
### No issue
 
**Fixed build defect preventing Jackson from being shaded**
 
 
[09a4f2e0a2861bf](https://github.com/tomakehurst/wiremock/commit/09a4f2e0a2861bf) tomakehurst *2013-12-18 13:59:03*
 
**Bumped version and fixed some JAR shading problems**
 
 
[f564d0281c91c09](https://github.com/tomakehurst/wiremock/commit/f564d0281c91c09) tomakehurst *2013-12-18 13:55:37*
 
**[doc] Fix broken link for the standalone jar**
 
 
[05fdd0b0f7ce3ed](https://github.com/tomakehurst/wiremock/commit/05fdd0b0f7ce3ed) Thomas LÉVEIL *2013-12-11 14:11:17*
 
 
## 1.38
### No issue
 
**Bumped version**
 
 
[4ab5cbfed45bb67](https://github.com/tomakehurst/wiremock/commit/4ab5cbfed45bb67) Tom Akehurst *2013-12-10 21:49:09*
 
**Updated docs to include equalToJson**
 
 
[a73ed70a0edeeeb](https://github.com/tomakehurst/wiremock/commit/a73ed70a0edeeeb) Tom Akehurst *2013-12-10 21:47:57*
 
 
## 1.37
### No issue
 
**Upped version. (Re?) added git tagging to build.**
 
 
[853d2362c2ce7fa](https://github.com/tomakehurst/wiremock/commit/853d2362c2ce7fa) Tom Akehurst *2013-12-04 21:20:12*
 
**Added port randomisation on a test. Minor tweaks to body capture in recorder.**
 
 
[0a4202613238015](https://github.com/tomakehurst/wiremock/commit/0a4202613238015) Tom Akehurst *2013-12-04 21:14:10*
 
**Added PHP binding link to docs**
 
 
[b9b01e71ec3ec39](https://github.com/tomakehurst/wiremock/commit/b9b01e71ec3ec39) Tom Akehurst *2013-12-03 22:21:52*
 
**Updated docs with random port and rule stubbing info**
 
 
[6a6c0a0dd5f5fd1](https://github.com/tomakehurst/wiremock/commit/6a6c0a0dd5f5fd1) Tom Akehurst *2013-12-03 22:03:09*
 
**Added addGitTag build task**
 
 
[08fd187bf7505dd](https://github.com/tomakehurst/wiremock/commit/08fd187bf7505dd) Tom Akehurst *2013-12-03 21:37:09*
 
**Now takes account of request body when recording stub mappings**
 
 
[d94536b32714387](https://github.com/tomakehurst/wiremock/commit/d94536b32714387) tomakehurst *2013-09-24 16:30:23*
 
**Fixed version (had accidentially bumped twice)**
 
 
[237b97f80e58a32](https://github.com/tomakehurst/wiremock/commit/237b97f80e58a32) Tom Akehurst *2013-09-14 14:15:34*
 
**Bumped version**
 
 
[0d0367949379c65](https://github.com/tomakehurst/wiremock/commit/0d0367949379c65) Tom Akehurst *2013-09-14 13:21:57*
 
**Corrected indent formatting.**
 
 
[09dfef8ba8dd8dd](https://github.com/tomakehurst/wiremock/commit/09dfef8ba8dd8dd) Christian Trimble *2013-09-10 07:43:42*
 
**Improved support for the charset parameter on Content-Type headers.**
 
 * - charset can now be missing when other parameters are supplied. 
 * - charset no longer needs to be the first parameter. 
 
[c3618ff352b868e](https://github.com/tomakehurst/wiremock/commit/c3618ff352b868e) Christian Trimble *2013-09-10 07:13:43*
 
**Bumped version and added download link to auto-version-bump list**
 
 
[117ae2171c9cba0](https://github.com/tomakehurst/wiremock/commit/117ae2171c9cba0) Tom Akehurst *2013-06-17 22:08:18*
 
 
## 1.36
### No issue
 
**allow stubbing and verification via the junit rules when binding to any available port**
 
 
[34ccad20e1eef1f](https://github.com/tomakehurst/wiremock/commit/34ccad20e1eef1f) Neil Green *2013-11-07 15:41:33*
 
**Bumped version and adding missing copyright headers**
 
 
[be4a5c8f894eeea](https://github.com/tomakehurst/wiremock/commit/be4a5c8f894eeea) Tom Akehurst *2013-10-27 18:52:26*
 
**Proxying now sends host header supplied (if supplied)**
 
 
[bafdf331199c393](https://github.com/tomakehurst/wiremock/commit/bafdf331199c393) Tom Akehurst *2013-10-27 18:40:18*
 
**Now honors content-length/transfer-encoding when proxying instead of always buffering and choosing content-length**
 
 
[bbda7e360b9a3cc](https://github.com/tomakehurst/wiremock/commit/bbda7e360b9a3cc) Tom Akehurst *2013-10-23 19:13:17*
 
**Added an additional browser proxying test and some extra logging**
 
 
[658e23a1b9823a0](https://github.com/tomakehurst/wiremock/commit/658e23a1b9823a0) Tom Akehurst *2013-10-22 21:10:03*
 
**Aesthetic tweaks to port number patch**
 
 
[98c1ad918d1901d](https://github.com/tomakehurst/wiremock/commit/98c1ad918d1901d) Tom Akehurst *2013-10-22 19:33:57*
 
**document return values for listening port methods on junit rules**
 
 
[2d5d167004f10a9](https://github.com/tomakehurst/wiremock/commit/2d5d167004f10a9) Neil Green *2013-10-19 12:19:27*
 
**make listening ports visible in junit rules**
 
 
[cbecb3a1c4a14ef](https://github.com/tomakehurst/wiremock/commit/cbecb3a1c4a14ef) Neil Green *2013-10-18 18:12:53*
 
**test that we can configure port zero to use an available port**
 
 
[1dac05540089628](https://github.com/tomakehurst/wiremock/commit/1dac05540089628) Neil Green *2013-10-17 16:54:28*
 
**fix typo**
 
 
[aab0ed0e3cba62a](https://github.com/tomakehurst/wiremock/commit/aab0ed0e3cba62a) Neil Green *2013-10-17 16:47:58*
 
**expose listening ports as properties**
 
 
[5c333950112adb4](https://github.com/tomakehurst/wiremock/commit/5c333950112adb4) Neil Green *2013-10-17 16:26:34*
 
**Bumped version and added missing copyright headers**
 
 
[aa794174ee4e5bc](https://github.com/tomakehurst/wiremock/commit/aa794174ee4e5bc) Tom Akehurst *2013-10-16 20:30:23*
 
**merge interfaces**
 
 
[c3b69b85a24dff3](https://github.com/tomakehurst/wiremock/commit/c3b69b85a24dff3) Neil Green *2013-10-15 17:02:58*
 
**test for rule based stubbing and verification across multiple rule instances**
 
 
[48d02847957b059](https://github.com/tomakehurst/wiremock/commit/48d02847957b059) Neil Green *2013-10-15 16:55:47*
 
**handle delaying in WireMockClassRule**
 
 
[41ee63296857e7b](https://github.com/tomakehurst/wiremock/commit/41ee63296857e7b) Neil Green *2013-10-14 17:42:50*
 
**handle delaying in WireMockRule**
 
 
[ae40049e0211b63](https://github.com/tomakehurst/wiremock/commit/ae40049e0211b63) Neil Green *2013-10-14 17:41:49*
 
**handle verifications in WireMockRule**
 
 
[f1bb4227a2681e5](https://github.com/tomakehurst/wiremock/commit/f1bb4227a2681e5) Neil Green *2013-10-14 17:39:27*
 
**handle stubbings in WireMockRule**
 
 
[a3066710a20918c](https://github.com/tomakehurst/wiremock/commit/a3066710a20918c) Neil Green *2013-10-14 17:28:51*
 
**handle verifications in WireMockClassRule**
 
 
[91383d6dceaccc6](https://github.com/tomakehurst/wiremock/commit/91383d6dceaccc6) Neil Green *2013-10-14 17:23:39*
 
**handle stubbings in WireMockClassRule**
 
 
[45148d69d61602f](https://github.com/tomakehurst/wiremock/commit/45148d69d61602f) Neil Green *2013-10-14 17:23:39*
 
**create an instance of WireMock for the server created by the WireMockClassRule**
 
 
[90327553bd9290c](https://github.com/tomakehurst/wiremock/commit/90327553bd9290c) Neil Green *2013-10-14 16:55:21*
 
**add interfaces for operations performed using static methods on WireMock**
 
 
[14eb74e6a96a9df](https://github.com/tomakehurst/wiremock/commit/14eb74e6a96a9df) Neil Green *2013-10-14 16:34:24*
 
 
## 1.33
### No issue
 
**Added docs for all stub mappings resource and JSONPath matching**
 
 
[ec0d7e9c1016e08](https://github.com/tomakehurst/wiremock/commit/ec0d7e9c1016e08) Tom Akehurst *2013-06-17 21:47:40*
 
**Made VerificationException a subclass of AssertionError for better JUnit reporting**
 
 
[2be641fa36a2e9c](https://github.com/tomakehurst/wiremock/commit/2be641fa36a2e9c) Tom Akehurst *2013-06-17 17:55:19*
 
**Upped version and added missing copyright headers**
 
 
[761d35c2710263a](https://github.com/tomakehurst/wiremock/commit/761d35c2710263a) Tom Akehurst *2013-06-17 17:49:25*
 
**Added body matching on JSON path**
 
 
[a28bda72a6ce5d3](https://github.com/tomakehurst/wiremock/commit/a28bda72a6ce5d3) Tom Akehurst *2013-06-17 17:48:36*
 
**@Ignored Examples.java tests (since they're not regression tests)**
 
 
[667df532013754d](https://github.com/tomakehurst/wiremock/commit/667df532013754d) Tom Akehurst *2013-06-17 12:40:01*
 
**Added redirect to root admin task**
 
 
[fdb6aea66a53902](https://github.com/tomakehurst/wiremock/commit/fdb6aea66a53902) Tom Akehurst *2013-06-17 12:34:47*
 
**Added all stub mappings admin resource**
 
 
[eaa25d09901e8f0](https://github.com/tomakehurst/wiremock/commit/eaa25d09901e8f0) Tom Akehurst *2013-06-16 22:14:27*
 
**Swapped out call to deprecated method**
 
 
[22e64dfbae5bc00](https://github.com/tomakehurst/wiremock/commit/22e64dfbae5bc00) Tom Akehurst *2013-06-16 21:35:51*
 
**Further simplification of HttpAdminClient**
 
 
[34644be786f611e](https://github.com/tomakehurst/wiremock/commit/34644be786f611e) Tom Akehurst *2013-06-16 21:27:07*
 
**Refactored admin interface to remove duplication around URL and method routing**
 
 
[78539352b032d8b](https://github.com/tomakehurst/wiremock/commit/78539352b032d8b) Tom Akehurst *2013-06-16 20:54:10*
 
**Added docs for downloading standalone version, reset to default, client configuration**
 
 
[4a642600c77bbb9](https://github.com/tomakehurst/wiremock/commit/4a642600c77bbb9) Tom Akehurst *2013-06-05 21:23:19*
 
**Added disabling of request journal to command line params**
 
 
[d4a4900e99de9e4](https://github.com/tomakehurst/wiremock/commit/d4a4900e99de9e4) Tom Akehurst *2013-06-02 14:01:04*
 
**Can now switch off the request journal and see an immediate error if attempting to verify or find requests**
 
 
[bba7ac36a616aa0](https://github.com/tomakehurst/wiremock/commit/bba7ac36a616aa0) Tom Akehurst *2013-06-02 13:50:30*
 
**Partially complete request journal disable feature**
 
 
[c4b4c854c0e3b81](https://github.com/tomakehurst/wiremock/commit/c4b4c854c0e3b81) Tom Akehurst *2013-05-27 21:53:29*
 
**Fixed problem with file name generation when recording from URLs with no path**
 
 
[86bd129252d2770](https://github.com/tomakehurst/wiremock/commit/86bd129252d2770) Tom Akehurst *2013-05-27 21:09:15*
 
**Fixed LoggedRequestTest so that it works in timezones other than GMT**
 
 
[56ac3d0773d3ab2](https://github.com/tomakehurst/wiremock/commit/56ac3d0773d3ab2) Tom Akehurst *2013-05-11 14:05:27*
 
**Optimised imports**
 
 
[1116786d3211d2c](https://github.com/tomakehurst/wiremock/commit/1116786d3211d2c) Tom Akehurst *2013-05-11 13:37:11*
 
**Fixed header matching bug - stub would be matched if required header absent from the request**
 
 
[9d9c0d588496057](https://github.com/tomakehurst/wiremock/commit/9d9c0d588496057) tomakehurst *2013-04-17 17:57:23*
 
**Now does not copy Transfer-Encoding header when proxying**
 
 
[bed65323f8db43e](https://github.com/tomakehurst/wiremock/commit/bed65323f8db43e) tomakehurst *2013-04-10 10:32:57*
 
**Removed some debug code from WireMockServer**
 
 
[a69f0067118dd9b](https://github.com/tomakehurst/wiremock/commit/a69f0067118dd9b) tomakehurst *2013-04-04 10:55:03*
 
**Prevented resetting the delay from throwing an exception when running in a war**
 
 
[c7f068044e8f1d2](https://github.com/tomakehurst/wiremock/commit/c7f068044e8f1d2) Rob.Elliot *2013-03-20 17:37:29*
 
**Stopped test from creating temp dirs and failing to clean them up**
 
 
[1644f8ee6697ea5](https://github.com/tomakehurst/wiremock/commit/1644f8ee6697ea5) Rob.Elliot *2013-03-20 16:13:40*
 
**Fixed failure to instantiate server when the default mappings file source does not exist**
 
 
[d860f2819e01d6c](https://github.com/tomakehurst/wiremock/commit/d860f2819e01d6c) Rob.Elliot *2013-03-20 15:52:01*
 
**Bumped version to 1.31**
 
 
[8db9e90713f20d4](https://github.com/tomakehurst/wiremock/commit/8db9e90713f20d4) tomakehurst *2013-03-19 18:07:10*
 
**Added a new reset mechanism that resets the server to the mappings provided on initialisation**
 
 
[a3f5bba7a1f30aa](https://github.com/tomakehurst/wiremock/commit/a3f5bba7a1f30aa) Rob.Elliot *2013-03-19 16:10:06*
 
**Minor doc update**
 
 
[7afe51f4b4ce8f2](https://github.com/tomakehurst/wiremock/commit/7afe51f4b4ce8f2) Tom Akehurst *2013-03-04 20:58:31*
 
**Finished documenting proxy-via and configuration features**
 
 
[c541b0c686bbfa0](https://github.com/tomakehurst/wiremock/commit/c541b0c686bbfa0) Tom Akehurst *2013-03-02 19:46:17*
 
**Minor update to JUnit rule tests**
 
 
[7e671802c7c4f1a](https://github.com/tomakehurst/wiremock/commit/7e671802c7c4f1a) Tom Akehurst *2013-03-02 19:29:22*
 
**WireMockRule and WireMockClassRule now both use Options**
 
 
[668fdfcfe7deb4b](https://github.com/tomakehurst/wiremock/commit/668fdfcfe7deb4b) Tom Akehurst *2013-03-02 19:27:56*
 
**Fixed bug where two WireMockServer instances were being started. Fixed bug in standalone test cleanup.**
 
 
[15cb0777a668ff4](https://github.com/tomakehurst/wiremock/commit/15cb0777a668ff4) Tom Akehurst *2013-03-02 19:24:46*
 
**WireMockRule now uses Options**
 
 
[491477f91097ad8](https://github.com/tomakehurst/wiremock/commit/491477f91097ad8) Tom Akehurst *2013-03-02 18:49:36*
 
**Added proxy-via and HTTPS command line options documentation**
 
 
[3778a93d3d017e5](https://github.com/tomakehurst/wiremock/commit/3778a93d3d017e5) Tom Akehurst *2013-03-02 18:48:35*
 
**Added acceptance tests for HTTPS alternative keystore**
 
 
[33625a7ce1cce6c](https://github.com/tomakehurst/wiremock/commit/33625a7ce1cce6c) Tom Akehurst *2013-03-02 00:02:28*
 
**Removed old HTTPS settings. Added tests for command line options.**
 
 
[978f2656aba0cf1](https://github.com/tomakehurst/wiremock/commit/978f2656aba0cf1) Tom Akehurst *2013-03-01 23:49:33*
 
**Moved https settings into a separate class**
 
 
[82cdfa3b0528e9d](https://github.com/tomakehurst/wiremock/commit/82cdfa3b0528e9d) Tom Akehurst *2013-03-01 23:34:02*
 
**WireMockServerRunner now uses Options rather than long WireMockServer constructor**
 
 
[800512546107eb4](https://github.com/tomakehurst/wiremock/commit/800512546107eb4) Tom Akehurst *2013-03-01 23:11:30*
 
**Started shifting to new configuration based WireMockServer constructor**
 
 
[ef66646a90d69cd](https://github.com/tomakehurst/wiremock/commit/ef66646a90d69cd) Tom Akehurst *2013-03-01 23:03:02*
 
**Added fluent configuration class. Started to switch WireMockServer over to use it.**
 
 
[3a237a04ca90b69](https://github.com/tomakehurst/wiremock/commit/3a237a04ca90b69) Tom Akehurst *2013-03-01 21:44:45*
 
**Extracted Options interface. Commandline options implements this. Moved DEFAULT_PORT to Options.**
 
 
[c9f4d758685717f](https://github.com/tomakehurst/wiremock/commit/c9f4d758685717f) Tom Akehurst *2013-03-01 21:15:46*
 
**Made WireMockRule also implement (more recent, non-deprecated) TestRule**
 
 
[be147f3082dd994](https://github.com/tomakehurst/wiremock/commit/be147f3082dd994) Tom Akehurst *2013-03-01 21:01:37*
 
**Now asserts that logback messages end up in stdout**
 
 
[7718bc5c4075b3d](https://github.com/tomakehurst/wiremock/commit/7718bc5c4075b3d) Tom Akehurst *2013-03-01 20:53:59*
 
**Initial merge of Rob's logging changes**
 
 
[4a4f022163c2239](https://github.com/tomakehurst/wiremock/commit/4a4f022163c2239) Tom Akehurst *2013-02-27 23:02:20*
 
**Re-added loggedDateString to logged request**
 
 
[fa22e67c8168266](https://github.com/tomakehurst/wiremock/commit/fa22e67c8168266) Tom Akehurst *2013-02-26 22:49:10*
 
**Now shows all received requests when verification fails (rather than just the expectation**
 
 
[89e2bc2d3e5cd5a](https://github.com/tomakehurst/wiremock/commit/89e2bc2d3e5cd5a) Tom Akehurst *2013-02-26 22:29:13*
 
**Removed some Gradle deprecation warnings**
 
 
[0b8ca11de9acaf3](https://github.com/tomakehurst/wiremock/commit/0b8ca11de9acaf3) Tom Akehurst *2013-02-26 21:56:01*
 
**Re-generated keystore from Java 1.4 (to allow easy import into Java 1.4 cacerts)**
 
 
[7330259723dc79f](https://github.com/tomakehurst/wiremock/commit/7330259723dc79f) tomakehurst *2013-02-20 15:37:52*
 
**Added ability to inject a custom notifier into WireMockServer, default remains Log4j**
 
 
[164764470a0a097](https://github.com/tomakehurst/wiremock/commit/164764470a0a097) Rob.Elliot *2013-02-20 09:37:31*
 
**Logging: moved logging config to a separate file and ensured it is only configured when running WireMock as an application (either standalone or in a war)**
 
 * Ensured log4j is not namespaced as logging works better that way 
 * Added test project that proves WireMock can then be used when sending Log4j to SLF4J 
 
[46e99599e884abd](https://github.com/tomakehurst/wiremock/commit/46e99599e884abd) Robert Elliot *2013-02-19 23:42:44*
 
**Added HTTPS port to command line options**
 
 
[43ccb7120344c60](https://github.com/tomakehurst/wiremock/commit/43ccb7120344c60) tomakehurst *2013-02-19 18:15:16*
 
**Added HTTPS support. No longer uses reflection to retrieve the socket for fault injection.**
 
 
[b2f346a0c3ff1aa](https://github.com/tomakehurst/wiremock/commit/b2f346a0c3ff1aa) tomakehurst *2013-02-19 18:04:00*
 
**Added ability to have proxy responses route via another (opaque) proxy. Proxy HTTP client now trusts all SSL certificates.**
 
 
[3487f918b762880](https://github.com/tomakehurst/wiremock/commit/3487f918b762880) tomakehurst *2013-02-19 13:38:02*
 
**Bumped version**
 
 
[2a873989249367c](https://github.com/tomakehurst/wiremock/commit/2a873989249367c) Tom Akehurst *2013-02-10 17:18:41*
 
**Upgraded to Jackson 2.1.2, the latest official release.**
 
 * This is almost entirely import changes, with one or two moves to equivalent but renamed methods. 
 
[5fb636d500daf87](https://github.com/tomakehurst/wiremock/commit/5fb636d500daf87) pimterry *2013-02-10 15:11:08*
 
**Upgraded to Jackson 1.9.12 (the last Jackson 1.9 release)**
 
 
[e2f225e29758893](https://github.com/tomakehurst/wiremock/commit/e2f225e29758893) pimterry *2013-02-10 14:00:06*
 
**Docs: documented new JUnit rules**
 
 
[4b028457dfe77a6](https://github.com/tomakehurst/wiremock/commit/4b028457dfe77a6) Tom Akehurst *2012-12-29 21:49:57*
 
**Bumped version to 1.28**
 
 
[0185e3275dccbb5](https://github.com/tomakehurst/wiremock/commit/0185e3275dccbb5) Tom Akehurst *2012-12-29 21:32:49*
 
**Deprecated WireMockStaticRule**
 
 
[ec279babdbe4c76](https://github.com/tomakehurst/wiremock/commit/ec279babdbe4c76) Tom Akehurst *2012-12-29 21:19:59*
 
**Fixed incorrect rule class in unit test**
 
 
[c6a88b25345406c](https://github.com/tomakehurst/wiremock/commit/c6a88b25345406c) Tom Akehurst *2012-12-29 21:16:11*
 
**Removed redundant exposure of browser proxy setting to stub request handler**
 
 
[6b7112ba7314e2c](https://github.com/tomakehurst/wiremock/commit/6b7112ba7314e2c) Tom Akehurst *2012-12-29 17:09:48*
 
**WireMockApp now no longer manages the stub request handler**
 
 
[369dcaff4e64224](https://github.com/tomakehurst/wiremock/commit/369dcaff4e64224) Tom Akehurst *2012-12-29 17:06:31*
 
**AdminRequestHandler is now not managed by WireMock app**
 
 
[df59422a0b44361](https://github.com/tomakehurst/wiremock/commit/df59422a0b44361) Tom Akehurst *2012-12-29 16:10:18*
 
**WireMockApp now no longer exposes the request journal**
 
 
[bbe9c031a01d715](https://github.com/tomakehurst/wiremock/commit/bbe9c031a01d715) Tom Akehurst *2012-12-29 16:03:28*
 
**Organised some imports. Removed unused method.**
 
 
[922c788a46ed913](https://github.com/tomakehurst/wiremock/commit/922c788a46ed913) Tom Akehurst *2012-12-29 15:51:58*
 
**Created StubServer and Admin interfaces to define both parts of WireMock's core features. Refactored the admin handler to make use of the Admin interface, removing its dependency on the internals of the app.**
 
 
[c20afb050a6cfbe](https://github.com/tomakehurst/wiremock/commit/c20afb050a6cfbe) Tom Akehurst *2012-12-29 15:43:32*
 
**Fixed (and renamed) AdminClient method for adding stub mappings, to make consistent with the rest of the API**
 
 
[44a11da9d5b4274](https://github.com/tomakehurst/wiremock/commit/44a11da9d5b4274) Tom Akehurst *2012-12-29 15:09:10*
 
**Further reduced cyclic dependencies**
 
 
[f4cc277a96b7d11](https://github.com/tomakehurst/wiremock/commit/f4cc277a96b7d11) Tom Akehurst *2012-12-29 14:45:37*
 
**Moved VerificationException back to client package to avoid a breaking change**
 
 
[1600604dc0a502b](https://github.com/tomakehurst/wiremock/commit/1600604dc0a502b) Tom Akehurst *2012-12-29 14:32:51*
 
**Renamed RequestResponseMapping to StubMapping**
 
 
[46c7118f163a514](https://github.com/tomakehurst/wiremock/commit/46c7118f163a514) Tom Akehurst *2012-12-29 14:27:55*
 
**More package moves. Begun removing cyclic dependencies guided by jdepend.**
 
 
[108d54e83002778](https://github.com/tomakehurst/wiremock/commit/108d54e83002778) Tom Akehurst *2012-12-29 14:21:06*
 
**Added jdepend to build**
 
 
[da6a83ee801e226](https://github.com/tomakehurst/wiremock/commit/da6a83ee801e226) Tom Akehurst *2012-12-29 13:44:49*
 
**Tweaked WireMockRule so it can now also be run as a @ClassRule in JUnit >= 4.9, keeping the server alive between individual tests.**
 
 
[ac1a3ee983a2bac](https://github.com/tomakehurst/wiremock/commit/ac1a3ee983a2bac) pimterry *2012-12-29 00:35:42*
 
**More class moves and renames**
 
 
[e351037f546cf33](https://github.com/tomakehurst/wiremock/commit/e351037f546cf33) Tom Akehurst *2012-12-29 00:16:26*
 
**Moved some classes to new packages and renamed a few**
 
 
[0ca656368ff4502](https://github.com/tomakehurst/wiremock/commit/0ca656368ff4502) Tom Akehurst *2012-12-28 23:45:33*
 
**Docs: documented request delay feature**
 
 
[476c1d0197298a2](https://github.com/tomakehurst/wiremock/commit/476c1d0197298a2) Tom Akehurst *2012-12-28 18:10:20*
 
**Upped version to 1.27**
 
 
[991b2ebb018b495](https://github.com/tomakehurst/wiremock/commit/991b2ebb018b495) Tom Akehurst *2012-12-28 17:29:41*
 
**Added copyright headers. Renamed a test class.**
 
 
[1aaa79f4aaeda4e](https://github.com/tomakehurst/wiremock/commit/1aaa79f4aaeda4e) Tom Akehurst *2012-12-28 17:24:50*
 
**Fixed issue where server thread continues to sleep after test case has completed. Some renames and tidy-ups.**
 
 
[fb20d1ce059a057](https://github.com/tomakehurst/wiremock/commit/fb20d1ce059a057) Tom Akehurst *2012-12-28 17:22:02*
 
**Cleaned up request delay code. Simplified API by removing request count option. WireMock.reset() now also resets request delay.**
 
 
[5e3630a3ce39a8d](https://github.com/tomakehurst/wiremock/commit/5e3630a3ce39a8d) Tom Akehurst *2012-12-28 14:29:51*
 
**Main test case (causing a socket timeout) working with some hacks in place**
 
 
[0bd2c7f940a0fc3](https://github.com/tomakehurst/wiremock/commit/0bd2c7f940a0fc3) Tom Akehurst *2012-12-27 22:18:47*
 
**Docs: Added non-junit section to getting started**
 
 
[d5052c3c1ef78cc](https://github.com/tomakehurst/wiremock/commit/d5052c3c1ef78cc) Tom Akehurst *2012-12-16 20:16:11*
 
**Revert "Bumped version to 1.27" because docs not yet published for 1.26**
 
 * This reverts commit f4f72e8d4c05f66d70c55ae6134db097fce59bcd. 
 
[d0763eeb5bab0fa](https://github.com/tomakehurst/wiremock/commit/d0763eeb5bab0fa) Tom Akehurst *2012-12-16 20:08:08*
 
**Docs: Added without() doc**
 
 
[fdd3c8d84cd5452](https://github.com/tomakehurst/wiremock/commit/fdd3c8d84cd5452) Tom Akehurst *2012-12-16 20:07:43*
 
**Added copyright header**
 
 
[ee84375f947f26d](https://github.com/tomakehurst/wiremock/commit/ee84375f947f26d) Tom Akehurst *2012-12-16 19:53:57*
 
**Fixed task definition bug**
 
 
[4c699a9a5396c96](https://github.com/tomakehurst/wiremock/commit/4c699a9a5396c96) Tom Akehurst *2012-12-16 19:48:57*
 
**Bumped version to 1.27**
 
 
[f4f72e8d4c05f66](https://github.com/tomakehurst/wiremock/commit/f4f72e8d4c05f66) Tom Akehurst *2012-12-16 19:44:26*
 
**Improved bump-version task logging**
 
 
[47e73e539741c10](https://github.com/tomakehurst/wiremock/commit/47e73e539741c10) Tom Akehurst *2012-12-16 19:43:47*
 
**Added bump-version task to build**
 
 
[34e2b13924d11ae](https://github.com/tomakehurst/wiremock/commit/34e2b13924d11ae) Tom Akehurst *2012-12-16 19:41:22*
 
**Upped version. Shadowed remaining open source libs in standalone JAR. Upped junit version and excluded dependencies not required in compile scope.**
 
 
[1b40c95356cf39c](https://github.com/tomakehurst/wiremock/commit/1b40c95356cf39c) Tom Akehurst *2012-12-16 18:56:36*
 
**Added jopt and log4j to JarJar shadowing rules. Log4j now configured programmatically.**
 
 
[8ea53a782baae28](https://github.com/tomakehurst/wiremock/commit/8ea53a782baae28) Tom Akehurst *2012-12-16 18:08:10*
 
**Modified README to point to new doc site**
 
 
[25d4d16d625ffa4](https://github.com/tomakehurst/wiremock/commit/25d4d16d625ffa4) Tom Akehurst *2012-12-04 23:01:34*
 
**Docs: Updated to correct tracking ID**
 
 
[ea346e2477cf409](https://github.com/tomakehurst/wiremock/commit/ea346e2477cf409) Tom Akehurst *2012-12-04 22:55:17*
 
**Docs: Added google analytics**
 
 
[2f6172921d6f09d](https://github.com/tomakehurst/wiremock/commit/2f6172921d6f09d) Tom Akehurst *2012-12-04 22:50:45*
 
**Added gen-docs script. Fixed some bad links in the doc markup.**
 
 
[24f9f4f6804e273](https://github.com/tomakehurst/wiremock/commit/24f9f4f6804e273) Tom Akehurst *2012-12-03 21:54:09*
 
**Docs: removed unused themes**
 
 
[805b61802712190](https://github.com/tomakehurst/wiremock/commit/805b61802712190) Tom Akehurst *2012-12-03 21:31:41*
 
**Docs: Various finishing touches**
 
 
[83f92f8ead363a5](https://github.com/tomakehurst/wiremock/commit/83f92f8ead363a5) Tom Akehurst *2012-12-02 22:17:43*
 
**Docs: tweaked layout. Added simulating faults content.**
 
 
[b64f2473f1942ba](https://github.com/tomakehurst/wiremock/commit/b64f2473f1942ba) Tom Akehurst *2012-12-02 22:04:22*
 
**Docs: complete record/playback content. Added statefulness content. Removed mailing list and maven site links.**
 
 
[c6a3f050e6770ff](https://github.com/tomakehurst/wiremock/commit/c6a3f050e6770ff) Tom Akehurst *2012-12-02 21:35:18*
 
**Docs: Added record/playback content**
 
 
[e09cd3fe8dfbd8c](https://github.com/tomakehurst/wiremock/commit/e09cd3fe8dfbd8c) Tom Akehurst *2012-12-02 19:06:26*
 
**Docs: added proxying content**
 
 
[09df018c6baeb7b](https://github.com/tomakehurst/wiremock/commit/09df018c6baeb7b) Tom Akehurst *2012-12-02 18:46:01*
 
**Docs: more stubbing and verification content**
 
 
[c4a15e4f1c42e44](https://github.com/tomakehurst/wiremock/commit/c4a15e4f1c42e44) Tom Akehurst *2012-12-02 16:23:28*
 
**Docs: Added more verification content.**
 
 
[6562bf3c87619af](https://github.com/tomakehurst/wiremock/commit/6562bf3c87619af) Tom Akehurst *2012-12-01 18:34:19*
 
**Docs: Added verification content. Changed tagline.**
 
 
[b91a798424071d3](https://github.com/tomakehurst/wiremock/commit/b91a798424071d3) Tom Akehurst *2012-12-01 18:25:50*
 
**Docs: Added refs and rubric to stubbing page**
 
 
[47344ba2a5c0248](https://github.com/tomakehurst/wiremock/commit/47344ba2a5c0248) Tom Akehurst *2012-12-01 17:39:57*
 
**Docs: More stubbing content**
 
 
[bc8e165b11542e4](https://github.com/tomakehurst/wiremock/commit/bc8e165b11542e4) Tom Akehurst *2012-12-01 17:35:57*
 
**Docs: added some more stubbing content**
 
 
[c7250cf1c38c515](https://github.com/tomakehurst/wiremock/commit/c7250cf1c38c515) Tom Akehurst *2012-12-01 16:23:09*
 
**Docs: added some more stubbing content**
 
 
[2c9c48921eec274](https://github.com/tomakehurst/wiremock/commit/2c9c48921eec274) Tom Akehurst *2012-12-01 15:16:16*
 
**Docs: added servlet container section to getting started**
 
 
[8dec4e6a7c7205c](https://github.com/tomakehurst/wiremock/commit/8dec4e6a7c7205c) Tom Akehurst *2012-12-01 14:09:51*
 
**Docs: Added more getting started content**
 
 
[a0da58c1bf85439](https://github.com/tomakehurst/wiremock/commit/a0da58c1bf85439) Tom Akehurst *2012-11-19 22:25:41*
 
**Added more getting started content**
 
 
[c98af6fe75974b5](https://github.com/tomakehurst/wiremock/commit/c98af6fe75974b5) Tom Akehurst *2012-11-19 21:56:00*
 
**Tweaked top bar colour. Now grey to medium-blue gradient.**
 
 
[dc543c9463fd8c9](https://github.com/tomakehurst/wiremock/commit/dc543c9463fd8c9) Tom Akehurst *2012-11-19 21:14:12*
 
**Switched to yammerdoc theme and tweaked colours**
 
 
[ebf3d0e1a12c922](https://github.com/tomakehurst/wiremock/commit/ebf3d0e1a12c922) Tom Akehurst *2012-11-19 21:06:19*
 
**Docs: Added more content to getting started. Split stubbing and verifying. Added Examples class to source to build up working code samples.**
 
 
[8792f23bb07243c](https://github.com/tomakehurst/wiremock/commit/8792f23bb07243c) Tom Akehurst *2012-11-18 22:58:31*
 
**Docs: minor style tweaks**
 
 
[7c23e3011ab81e6](https://github.com/tomakehurst/wiremock/commit/7c23e3011ab81e6) Tom Akehurst *2012-11-18 19:32:58*
 
**Docs: Added some more getting-started content**
 
 
[56203f5d16bb95f](https://github.com/tomakehurst/wiremock/commit/56203f5d16bb95f) Tom Akehurst *2012-11-18 18:46:05*
 
**Docs: Added some more content**
 
 
[014be1f86fa2b74](https://github.com/tomakehurst/wiremock/commit/014be1f86fa2b74) Tom Akehurst *2012-11-18 17:49:10*
 
**Docs: Added some content to the index**
 
 
[903225bb8e10f01](https://github.com/tomakehurst/wiremock/commit/903225bb8e10f01) Tom Akehurst *2012-11-18 17:42:32*
 
**Docs: added another candidate theme**
 
 
[856b70fab095f81](https://github.com/tomakehurst/wiremock/commit/856b70fab095f81) Tom Akehurst *2012-11-18 16:46:44*
 
**Docs: Experimental Sphinx setup**
 
 
[636816153fe3b95](https://github.com/tomakehurst/wiremock/commit/636816153fe3b95) Tom Akehurst *2012-11-18 14:47:30*
 
**Updated version in README and sample-war**
 
 
[edf7a67cde148af](https://github.com/tomakehurst/wiremock/commit/edf7a67cde148af) Tom Akehurst *2012-10-12 22:36:03*
 
 
## release-1.25
### Jira UTF-8   
 
**Fixed a bug causing body files created during recording being encoded as UTF-8 strings, causing binary content to be incorrectly stored.**
 
 
[aacd8a6b6b640b4](https://github.com/tomakehurst/wiremock/commit/aacd8a6b6b640b4) Tom Akehurst *2012-09-28 21:16:49*
 
 
### No issue
 
**Added missing copyright headers**
 
 
[a563a0a0d2e6dfb](https://github.com/tomakehurst/wiremock/commit/a563a0a0d2e6dfb) Tom Akehurst *2012-10-12 22:25:57*
 
**Fixed toString() in ValuePattern to accomodate absent state**
 
 
[9ea93752ba72fd5](https://github.com/tomakehurst/wiremock/commit/9ea93752ba72fd5) Tom Akehurst *2012-10-12 22:21:34*
 
**Added ability to create a request pattern specifying a header should not be present**
 
 
[7b09df2c18dcd0c](https://github.com/tomakehurst/wiremock/commit/7b09df2c18dcd0c) Tom Akehurst *2012-10-12 22:07:53*
 
**Made JSON writing prettier**
 
 
[9949c028d576995](https://github.com/tomakehurst/wiremock/commit/9949c028d576995) Tom Akehurst *2012-10-01 20:34:18*
 
**Formatting and assertion tweaks to Json**
 
 
[dfcede66550177f](https://github.com/tomakehurst/wiremock/commit/dfcede66550177f) Tom Akehurst *2012-10-01 20:16:37*
 
**Code to accept a commandline options that tells the Json parser to allow comments was removed. Now the default behavior of the Json parser is to always allow comments in the Json code.**
 
 
[5c5e9e7480cdbc1](https://github.com/tomakehurst/wiremock/commit/5c5e9e7480cdbc1) unknown *2012-10-01 14:45:28*
 
**HttpHeaders now properly immutable**
 
 
[774777799b30d2c](https://github.com/tomakehurst/wiremock/commit/774777799b30d2c) Tom Akehurst *2012-09-29 21:45:10*
 
**Removed put() completely from HttpHeaders**
 
 
[e2524d0ad596560](https://github.com/tomakehurst/wiremock/commit/e2524d0ad596560) Tom Akehurst *2012-09-29 21:32:30*
 
**Removed addHeader() completely from ResponseDefinition**
 
 
[ee0e9a1adfab906](https://github.com/tomakehurst/wiremock/commit/ee0e9a1adfab906) Tom Akehurst *2012-09-29 21:29:46*
 
**Removed addHeader call from MappingFileWriterListener**
 
 
[d935cdc32d4775b](https://github.com/tomakehurst/wiremock/commit/d935cdc32d4775b) Tom Akehurst *2012-09-29 21:27:05*
 
**Removed RequestResponseMappingBuilder's dependency on HttpHeaders.put()**
 
 
[3b847c3907a8e1d](https://github.com/tomakehurst/wiremock/commit/3b847c3907a8e1d) Tom Akehurst *2012-09-29 21:21:16*
 
**Removed MockRequestBuilder's dependency on HttpHeaders.put()**
 
 
[4370faf7db1756e](https://github.com/tomakehurst/wiremock/commit/4370faf7db1756e) Tom Akehurst *2012-09-29 21:06:46*
 
**Removed unused method from ContentTypeHeader**
 
 
[f4ac3f25e5ff1f5](https://github.com/tomakehurst/wiremock/commit/f4ac3f25e5ff1f5) Tom Akehurst *2012-09-28 20:33:55*
 
**Refactor to move retrieval of content type header to Request**
 
 
[057e97188e708d0](https://github.com/tomakehurst/wiremock/commit/057e97188e708d0) Tom Akehurst *2012-09-28 20:32:35*
 
**Add ability for user to specify a command line option "enable-comments" that configures the json parser to allow comments in the json files.**
 
 * If no command line option is provided, the json parser will not allow comments (this is the current behavior). 
 * This works in standalone mode. 
 
[eee8011f24f0dbd](https://github.com/tomakehurst/wiremock/commit/eee8011f24f0dbd) unknown *2012-09-28 19:56:29*
 
**Upgraded to Guava 13.0.1**
 
 
[e6590a56e7b3545](https://github.com/tomakehurst/wiremock/commit/e6590a56e7b3545) Tom Akehurst *2012-09-26 22:27:08*
 
**Response is now immutable**
 
 
[9abdd5c1d90baba](https://github.com/tomakehurst/wiremock/commit/9abdd5c1d90baba) Tom Akehurst *2012-09-26 22:02:25*
 
**Made LoggedRequest properly immutable by setting fields to final**
 
 
[583bde1f0720342](https://github.com/tomakehurst/wiremock/commit/583bde1f0720342) Tom Akehurst *2012-09-26 20:04:44*
 
**Removed ResponseDefinitionBuilder's use of HttpHeaders.put()**
 
 
[6feba4f243855e1](https://github.com/tomakehurst/wiremock/commit/6feba4f243855e1) Tom Akehurst *2012-09-26 19:58:55*
 
**Made LoggedRequest immutable**
 
 
[dcc9498e71b2ec5](https://github.com/tomakehurst/wiremock/commit/dcc9498e71b2ec5) Tom Akehurst *2012-09-26 19:54:35*
 
**Import tidy-up**
 
 
[58a1932aacc7cff](https://github.com/tomakehurst/wiremock/commit/58a1932aacc7cff) Tom Akehurst *2012-09-26 19:48:12*
 
**LoggedRequest now makes use of case-insensitive header key matching**
 
 
[a5520bac94f8c32](https://github.com/tomakehurst/wiremock/commit/a5520bac94f8c32) Tom Akehurst *2012-09-24 20:39:46*
 
**HttpHeaders now supports case-insensitive header keys**
 
 
[e489b69adbb1e10](https://github.com/tomakehurst/wiremock/commit/e489b69adbb1e10) Tom Akehurst *2012-09-24 20:37:32*
 
**Removed redundant call from HttpHeaders**
 
 
[53058d2eaa9a7b6](https://github.com/tomakehurst/wiremock/commit/53058d2eaa9a7b6) Tom Akehurst *2012-09-24 20:05:32*
 
**Updated version in README**
 
 
[4a76701a9d52cb3](https://github.com/tomakehurst/wiremock/commit/4a76701a9d52cb3) tomakehurst *2012-08-09 08:34:41*
 
**Fixed bug preventing scenarios from being correcly reset on a WireMock.reset() call**
 
 
[b4ebc8627f20661](https://github.com/tomakehurst/wiremock/commit/b4ebc8627f20661) tomakehurst *2012-08-01 16:30:16*
 
**Now joins jetty server on shutdown to avoid timing problems**
 
 
[88a400c5ccccdce](https://github.com/tomakehurst/wiremock/commit/88a400c5ccccdce) tomakehurst *2012-08-01 15:47:00*
 
**missed a comma, update to text**
 
 
[8acc93fe99300d4](https://github.com/tomakehurst/wiremock/commit/8acc93fe99300d4) Dominic Tootell *2012-07-21 06:29:08*
 
**documentation for the binary handling**
 
 
[f66b3359f7b2790](https://github.com/tomakehurst/wiremock/commit/f66b3359f7b2790) Dominic Tootell *2012-07-21 06:17:25*
 
**Updated README with multiple valued header info**
 
 
[0fbaafe5aacff2a](https://github.com/tomakehurst/wiremock/commit/0fbaafe5aacff2a) tomakehurst *2012-07-20 11:23:42*
 
**Upped version**
 
 
[0c55cb388d38e45](https://github.com/tomakehurst/wiremock/commit/0c55cb388d38e45) tomakehurst *2012-07-20 10:53:49*
 
**Removed HttpHeaders.get() (legacy of Map implementation)**
 
 
[b315ccf26db334a](https://github.com/tomakehurst/wiremock/commit/b315ccf26db334a) Tom Akehurst *2012-07-18 17:31:33*
 
**HttpHeaders now on longer extends HashMap.**
 
 
[262b8aa5577f05f](https://github.com/tomakehurst/wiremock/commit/262b8aa5577f05f) Tom Akehurst *2012-07-18 17:29:30*
 
**Added serializer for HttpHeaders capable of handling single or multi-valued headers**
 
 
[27a8a8ecaa6aff1](https://github.com/tomakehurst/wiremock/commit/27a8a8ecaa6aff1) Tom Akehurst *2012-07-18 17:23:38*
 
**Added HttpHeaders deserializer capable of handling single or multi-value headers**
 
 
[bea7fcd3da94031](https://github.com/tomakehurst/wiremock/commit/bea7fcd3da94031) Tom Akehurst *2012-07-18 17:03:29*
 
**Renamed JsonMappingBinder to Json**
 
 
[d0eef2babe25dac](https://github.com/tomakehurst/wiremock/commit/d0eef2babe25dac) Tom Akehurst *2012-07-18 15:45:54*
 
**Added some additional ResponseDefinition serialization tests**
 
 
[760e120bf9a2e10](https://github.com/tomakehurst/wiremock/commit/760e120bf9a2e10) Tom Akehurst *2012-07-18 15:43:59*
 
**Some minor refacorings and tidy-up after merging tootedom's binary body changes**
 
 
[23f965bcb8b67b2](https://github.com/tomakehurst/wiremock/commit/23f965bcb8b67b2) Tom Akehurst *2012-07-15 20:50:30*
 
**Revert "Added base64 body to response definition"**
 
 * This reverts commit 5fd5607232432dd9284ef0ad20947ed0a69471fe. 
 
[2bc5c479f4fcd9f](https://github.com/tomakehurst/wiremock/commit/2bc5c479f4fcd9f) Tom Akehurst *2012-07-15 20:14:14*
 
**Removed use of deprecated attribute in build**
 
 
[6647e5a1fb1ea18](https://github.com/tomakehurst/wiremock/commit/6647e5a1fb1ea18) Tom Akehurst *2012-07-15 19:42:49*
 
**Suppressed warning in test**
 
 
[ee05d040e3d56f5](https://github.com/tomakehurst/wiremock/commit/ee05d040e3d56f5) Tom Akehurst *2012-07-15 19:42:00*
 
**Further refactorings towards HttpHeaders no longer being a Map implementation**
 
 
[45a57fab37ac1d7](https://github.com/tomakehurst/wiremock/commit/45a57fab37ac1d7) Tom Akehurst *2012-07-15 19:40:12*
 
**Removed use of HttpHeaders.entrySet()**
 
 
[d2ad3625f7141fa](https://github.com/tomakehurst/wiremock/commit/d2ad3625f7141fa) Tom Akehurst *2012-07-15 18:59:39*
 
**Revert "Removed use of HttpHeaders.putAll()"**
 
 * This reverts commit efe6b2f82644e58f8f6e3c07365dd170e774ea84. 
 
[ee4b5fe20e22bd1](https://github.com/tomakehurst/wiremock/commit/ee4b5fe20e22bd1) Tom Akehurst *2012-07-15 18:54:21*
 
**Removed use of HttpHeaders.putAll()**
 
 
[efe6b2f82644e58](https://github.com/tomakehurst/wiremock/commit/efe6b2f82644e58) Tom Akehurst *2012-07-15 18:53:32*
 
**Removed use of HttpHeaders.putAll()**
 
 
[53a6a0a84c408d7](https://github.com/tomakehurst/wiremock/commit/53a6a0a84c408d7) Tom Akehurst *2012-07-15 18:53:21*
 
**Removed use of HttpHeaders.containsKey()**
 
 
[8a6976d4ffa4ceb](https://github.com/tomakehurst/wiremock/commit/8a6976d4ffa4ceb) Tom Akehurst *2012-07-15 18:34:25*
 
**Removed use of HttpHeaders.get()**
 
 
[f0e351b3224bf4f](https://github.com/tomakehurst/wiremock/commit/f0e351b3224bf4f) Tom Akehurst *2012-07-15 18:33:14*
 
**Added extra test verification for mult-valued headers**
 
 
[580d5cff9cf35c3](https://github.com/tomakehurst/wiremock/commit/580d5cff9cf35c3) Tom Akehurst *2012-07-15 18:16:50*
 
**Now supports verification of multi-valued headers**
 
 
[8a8dc2dac26de2d](https://github.com/tomakehurst/wiremock/commit/8a8dc2dac26de2d) Tom Akehurst *2012-07-15 18:14:40*
 
**Added more features to HttpHeader and HttpHeaders and dependent classes to support multi-valued headers**
 
 
[b477953422b96d0](https://github.com/tomakehurst/wiremock/commit/b477953422b96d0) Tom Akehurst *2012-07-15 18:03:13*
 
**add setBase64Body as per pull response conversation.  Update the mapping test to take into consideration the new json key "base64Body" to hold the base64 encoded binary byte[]**
 
 
[4ead549c110955c](https://github.com/tomakehurst/wiremock/commit/4ead549c110955c) Dominic Tootell *2012-07-11 22:22:21*
 
**add setBase64Body as per pull response conversation.  Update the mapping test to take into consideration the new json key "base64Body" to hold the base64 encoded binary byte[]**
 
 
[2217382e3c2dc06](https://github.com/tomakehurst/wiremock/commit/2217382e3c2dc06) Dominic Tootell *2012-07-11 22:20:52*
 
**More changes towards refactoring HttpHeaders away from being a HashMap subclass**
 
 
[ef28ec0b0252b9d](https://github.com/tomakehurst/wiremock/commit/ef28ec0b0252b9d) Tom Akehurst *2012-07-11 20:06:33*
 
**HttpHeaders now returns absent and present headers**
 
 
[6b1187ad63578db](https://github.com/tomakehurst/wiremock/commit/6b1187ad63578db) Tom Akehurst *2012-07-11 19:31:43*
 
**Started building HttpHeader class and reworking HttpHeaders class in order to support multiple header values**
 
 
[15bf0899967e5ca](https://github.com/tomakehurst/wiremock/commit/15bf0899967e5ca) Tom Akehurst *2012-07-11 19:22:49*
 
**Added base64 body to response definition**
 
 
[5fd5607232432dd](https://github.com/tomakehurst/wiremock/commit/5fd5607232432dd) Tom Akehurst *2012-07-11 14:47:47*
 
**Add support for binary files.**
 
 
[e0c85b89dcde792](https://github.com/tomakehurst/wiremock/commit/e0c85b89dcde792) Dominic Tootell *2012-07-08 14:01:39*
 
**Update ability to add binary content.  removed need for separate withByteBody, and byteBody json element.  It is now just an overloaded withBody.  The json is "body": [65,66,67]**
 
 
[eebafc94eb38a4a](https://github.com/tomakehurst/wiremock/commit/eebafc94eb38a4a) Dominic Tootell *2012-07-08 08:28:00*
 
**Remove need for Array reflection call.  Add Ability to support binary body content, i.e. a byteBody (withByteBody)**
 
 
[fe7c9e5af2f4c1c](https://github.com/tomakehurst/wiremock/commit/fe7c9e5af2f4c1c) Dominic Tootell *2012-07-07 21:16:40*
 
**Add Ability to support binary body content, i.e. a byteBody (withByteBody)**
 
 
[82e30d69dc73dad](https://github.com/tomakehurst/wiremock/commit/82e30d69dc73dad) Dominic Tootell *2012-07-07 17:43:08*
 
**Updated README**
 
 
[cc621c18fca92f9](https://github.com/tomakehurst/wiremock/commit/cc621c18fca92f9) tomakehurst *2012-06-08 09:25:24*
 
**Raised Jetty head buffer size to avoid 413 errors. Added string logged date to LoggedRequest.**
 
 
[d4ceba01edef98d](https://github.com/tomakehurst/wiremock/commit/d4ceba01edef98d) tomakehurst *2012-06-07 15:37:14*
 
**Added logged date to LoggedRequest. Redirects now not followed by proxy client. Added test to ensure requests are returned in the order they're inserted.**
 
 
[e40c16ab80129e4](https://github.com/tomakehurst/wiremock/commit/e40c16ab80129e4) tomakehurst *2012-06-07 14:43:11*
 
**Added ability to pull logged requests from the wiremock server. Allows more precise test assertions to be made.**
 
 
[85eab0007db8c5c](https://github.com/tomakehurst/wiremock/commit/85eab0007db8c5c) tomakehurst *2012-06-07 11:08:16*
 
**Updated README and sample war for 1.20**
 
 
[21582582feb95e4](https://github.com/tomakehurst/wiremock/commit/21582582feb95e4) Tom Akehurst *2012-05-26 19:11:07*
 
**Removed redundant null check**
 
 
[155a59bd2224e6c](https://github.com/tomakehurst/wiremock/commit/155a59bd2224e6c) Tom Akehurst *2012-05-26 17:28:12*
 
**Ignored IDEA files. Fixed bugs with both JUnit rule classes where one test failure causes a cascade.**
 
 
[5097d54297bd575](https://github.com/tomakehurst/wiremock/commit/5097d54297bd575) Tom Akehurst *2012-05-26 17:12:33*
 
**Updated README**
 
 
[2012b542a8d725f](https://github.com/tomakehurst/wiremock/commit/2012b542a8d725f) tomakehurst *2012-05-22 15:46:23*
 
**Updated sample-war wiremock dependency version**
 
 
[59dc7cb457b479f](https://github.com/tomakehurst/wiremock/commit/59dc7cb457b479f) tomakehurst *2012-05-22 09:25:24*
 
**Re-added signing to build**
 
 
[41416d56d3dbc93](https://github.com/tomakehurst/wiremock/commit/41416d56d3dbc93) tomakehurst *2012-05-22 09:22:54*
 
**Now uses JarJar to build standalone version**
 
 
[7e54556cf53342b](https://github.com/tomakehurst/wiremock/commit/7e54556cf53342b) tomakehurst *2012-05-21 17:28:50*
 
**Added WireMock.configure() to ensure client port is returned to 8080 before standalone tests start**
 
 
[4dd3b5fc5dd0670](https://github.com/tomakehurst/wiremock/commit/4dd3b5fc5dd0670) Tom Akehurst *2012-05-20 13:26:50*
 
**Updated README to reflect the move to maven central.**
 
 
[83908a30d429807](https://github.com/tomakehurst/wiremock/commit/83908a30d429807) Tom Akehurst *2012-04-09 18:57:31*
 
**Main build now includes signing. Removed alt build.**
 
 
[2ad9627b019fd8f](https://github.com/tomakehurst/wiremock/commit/2ad9627b019fd8f) Tom Akehurst *2012-04-08 17:07:34*
 
**Updated new build to include PGP signing and javadocs for m2 central compliance**
 
 
[38020e6b79ba20d](https://github.com/tomakehurst/wiremock/commit/38020e6b79ba20d) Tom Akehurst *2012-04-08 11:12:30*
 
**Updated README**
 
 
[6ca3fe955d169a9](https://github.com/tomakehurst/wiremock/commit/6ca3fe955d169a9) Tom Akehurst *2012-03-25 21:40:01*
 
**Reverted to older (working) build, and created new build file containing maven central additions. Will eventually reconcile when maven central additions are working**
 
 
[ffb1237b18658c9](https://github.com/tomakehurst/wiremock/commit/ffb1237b18658c9) Tom Akehurst *2012-03-25 21:38:38*
 
**Added copyright headers and fixed build problems created by partially complete signing additions**
 
 
[cc65d8e776115e1](https://github.com/tomakehurst/wiremock/commit/cc65d8e776115e1) Tom Akehurst *2012-03-25 21:28:18*
 
**Fixed two bugs: Stack Overflow instead of 404 in WAR mode on Tomcat, exception thrown when tring to detect underlying _uri field in non-Jetty containers**
 
 
[10024ee2cf2d8b2](https://github.com/tomakehurst/wiremock/commit/10024ee2cf2d8b2) Tom Akehurst *2012-03-25 21:22:03*
 
**Added JUnit rule for static use**
 
 
[d687a294134b343](https://github.com/tomakehurst/wiremock/commit/d687a294134b343) tomakehurst *2012-03-21 10:25:23*
 
**Added sources to build**
 
 
[2c39b5a297d8e3f](https://github.com/tomakehurst/wiremock/commit/2c39b5a297d8e3f) tomakehurst *2012-03-19 17:36:29*
 
**Started configuring build for maven central compliant releases|**
 
 
[54a42dc2375b478](https://github.com/tomakehurst/wiremock/commit/54a42dc2375b478) tomakehurst *2012-03-19 10:42:56*
 
**Added additional fields to generated POM in preparation for Maven Central deployment**
 
 
[74e34726262fc8a](https://github.com/tomakehurst/wiremock/commit/74e34726262fc8a) tomakehurst *2012-03-16 11:03:11*
 
**Browser proxying is now toggled via the command line**
 
 
[06bd7272fafb19c](https://github.com/tomakehurst/wiremock/commit/06bd7272fafb19c) tomakehurst *2012-03-14 13:19:02*
 
**Added ability to use wiremock as a browser proxy. Currently this is always switched on.**
 
 
[c6e4c113a8b7774](https://github.com/tomakehurst/wiremock/commit/c6e4c113a8b7774) Akehurst *2012-03-14 12:05:18*
 
**Small README update**
 
 
[a0fd6b258ea9aad](https://github.com/tomakehurst/wiremock/commit/a0fd6b258ea9aad) Tom Akehurst *2012-02-19 00:04:38*
 
**Upped version**
 
 
[26a07321130073a](https://github.com/tomakehurst/wiremock/commit/26a07321130073a) Tom Akehurst *2012-02-19 00:01:51*
 
**Updated docs to include discussion of scenarios**
 
 
[af91dbccb1a313b](https://github.com/tomakehurst/wiremock/commit/af91dbccb1a313b) Tom Akehurst *2012-02-19 00:00:35*
 
**Added stubFor() alias to WireMock.givenThat()**
 
 
[925a1ab33b33c31](https://github.com/tomakehurst/wiremock/commit/925a1ab33b33c31) Tom Akehurst *2012-02-18 23:19:33*
 
**Added ability to reset scenarios**
 
 
[2249532ca258912](https://github.com/tomakehurst/wiremock/commit/2249532ca258912) Tom Akehurst *2012-02-18 23:09:41*
 
**Updated README and added reset() method to Scenario**
 
 
[4bbae64e50a4e02](https://github.com/tomakehurst/wiremock/commit/4bbae64e50a4e02) Tom Akehurst *2012-02-18 19:45:36*
 
**Upped version**
 
 
[f3eab6cdd6d5137](https://github.com/tomakehurst/wiremock/commit/f3eab6cdd6d5137) Tom Akehurst *2012-02-18 17:56:19*
 
**Refactored scenario handling to move mapping evaluation to RequestResponseMapping**
 
 
[da2611f2afd1548](https://github.com/tomakehurst/wiremock/commit/da2611f2afd1548) Tom Akehurst *2012-02-18 16:13:19*
 
**Added ability for in-scenario mappings to be independent of state**
 
 
[890f0dc1e185e76](https://github.com/tomakehurst/wiremock/commit/890f0dc1e185e76) Tom Akehurst *2012-02-17 12:15:31*
 
**Initial scenarios work. Basic acceptance test passing.**
 
 
[be10eb62f2829df](https://github.com/tomakehurst/wiremock/commit/be10eb62f2829df) Tom Akehurst *2012-02-12 23:06:20*
 
 
## release-1.14
### No issue
 
**Upped version. Tweaked README.**
 
 
[32debbb0f7d8d8b](https://github.com/tomakehurst/wiremock/commit/32debbb0f7d8d8b) Tom Akehurst *2012-02-12 19:01:02*
 
**Updated docs for JUnit rule**
 
 
[77015a698ca99f3](https://github.com/tomakehurst/wiremock/commit/77015a698ca99f3) Tom Akehurst *2012-02-12 13:26:10*
 
**Fixed junit dependency problem in build**
 
 
[76ea89c9b74fece](https://github.com/tomakehurst/wiremock/commit/76ea89c9b74fece) Tom Akehurst *2012-02-12 13:15:34*
 
**Added separate test for JUnit rule**
 
 
[ce319d8f3d04e64](https://github.com/tomakehurst/wiremock/commit/ce319d8f3d04e64) Tom Akehurst *2012-02-12 13:13:08*
 
**Added JUnit rule**
 
 
[f98fa0a2c04cea4](https://github.com/tomakehurst/wiremock/commit/f98fa0a2c04cea4) Tom Akehurst *2012-02-12 13:04:47*
 
**Updated README.md**
 
 
[fc73bd2795b1acd](https://github.com/tomakehurst/wiremock/commit/fc73bd2795b1acd) Tom Akehurst *2012-02-09 12:55:19*
 
**Upped version to 1.13**
 
 
[6fe65bba3964218](https://github.com/tomakehurst/wiremock/commit/6fe65bba3964218) Tom Akehurst *2012-01-31 14:19:00*
 
**Response code now defaults to 200 when not specified**
 
 
[4a4ed59be337c86](https://github.com/tomakehurst/wiremock/commit/4a4ed59be337c86) Tom Akehurst *2012-01-25 20:11:31*
 
**Now only forwards GETs to __files context**
 
 
[87dc33ff2bec2a5](https://github.com/tomakehurst/wiremock/commit/87dc33ff2bec2a5) Tom Akehurst *2012-01-25 19:58:43*
 
**Updated missing header example to README**
 
 
[85f154b7f684eed](https://github.com/tomakehurst/wiremock/commit/85f154b7f684eed) Tom Akehurst *2012-01-24 17:17:34*
 
**Updated docs for 1.12. Updated sample WAR depedency version to 1.12**
 
 
[a856aefd9219cdd](https://github.com/tomakehurst/wiremock/commit/a856aefd9219cdd) Tom Akehurst *2012-01-24 17:16:04*
 
**Bumped version**
 
 
[2e127d776886114](https://github.com/tomakehurst/wiremock/commit/2e127d776886114) Tom Akehurst *2012-01-24 16:41:59*
 
**Fixed file serving issue**
 
 
[143a127ade51559](https://github.com/tomakehurst/wiremock/commit/143a127ade51559) Tom Akehurst *2012-01-23 22:00:13*
 
**Tweaked some generic code to avoid mysterious, host-specific compile error**
 
 
[aa13edc58c651d3](https://github.com/tomakehurst/wiremock/commit/aa13edc58c651d3) Tom Akehurst *2012-01-23 17:34:44*
 
**Recording now only happens for proxied requests**
 
 
[10e3f97b4822edb](https://github.com/tomakehurst/wiremock/commit/10e3f97b4822edb) Tom Akehurst *2012-01-23 17:25:47*
 
**Now fully supports a collection of body patterns for request matching**
 
 
[f687dca810e2407](https://github.com/tomakehurst/wiremock/commit/f687dca810e2407) Tom Akehurst *2012-01-22 20:56:46*
 
**Refactor of HeaderMatchingStrategy to support use for matching body values**
 
 
[d2ab14a2a25dd86](https://github.com/tomakehurst/wiremock/commit/d2ab14a2a25dd86) Tom Akehurst *2012-01-22 19:31:07*
 
**Body pattern within request pattern is now a collection such that multiple patterns can be specified**
 
 
[29dc65108816571](https://github.com/tomakehurst/wiremock/commit/29dc65108816571) Tom Akehurst *2012-01-22 19:23:09*
 
**Added copyright headers and added build step to insert them**
 
 
[561f17ee5d8be39](https://github.com/tomakehurst/wiremock/commit/561f17ee5d8be39) Tom Akehurst *2012-01-22 17:10:22*
 
**Added additional tests to ensure escaped URLs work ok**
 
 
[439e7e119e16af8](https://github.com/tomakehurst/wiremock/commit/439e7e119e16af8) Tom Akehurst *2012-01-22 16:26:18*
 
**Made header key matching case insensitive**
 
 
[d9ccfc8e8a33043](https://github.com/tomakehurst/wiremock/commit/d9ccfc8e8a33043) Tom Akehurst *2012-01-22 16:16:23*
 
**Tidy-up of header pattern tests**
 
 
[bc3660f7ef50233](https://github.com/tomakehurst/wiremock/commit/bc3660f7ef50233) Tom Akehurst *2012-01-22 15:41:28*
 
**Added more detailed logging for when header is not matched**
 
 
[958c93487204b68](https://github.com/tomakehurst/wiremock/commit/958c93487204b68) Tom Akehurst *2012-01-22 15:36:59*
 
**Now strips Host header from http client call when proxying**
 
 
[12c9560c6d16385](https://github.com/tomakehurst/wiremock/commit/12c9560c6d16385) Tom Akehurst *2012-01-22 12:43:02*
 
**Updated readme for new version**
 
 
[9482db309a73fcd](https://github.com/tomakehurst/wiremock/commit/9482db309a73fcd) Tom Akehurst *2012-01-20 13:27:55*
 
**Added body matching methods to MappingBuilder**
 
 
[28e461dc2f6ee2b](https://github.com/tomakehurst/wiremock/commit/28e461dc2f6ee2b) Tom Akehurst *2012-01-20 13:23:11*
 
**Upped version number. Switched off directory listing in default servlet in standalone mode. Made file source root in WAR configurale.**
 
 
[d85e6d5bf0fc95a](https://github.com/tomakehurst/wiremock/commit/d85e6d5bf0fc95a) Tom Akehurst *2012-01-20 11:28:46*
 
**URL is now decoded before forwarding to the default servlet when no mapping is found as this was previously failing where escape chars were present**
 
 
[090db67cd5b0498](https://github.com/tomakehurst/wiremock/commit/090db67cd5b0498) Tom Akehurst *2012-01-19 16:38:15*
 
**Reduced logging of non-matched URLs**
 
 
[ceca5ba008319e4](https://github.com/tomakehurst/wiremock/commit/ceca5ba008319e4) Tom Akehurst *2012-01-18 13:16:28*
 
**Removed extraneous servlet API dependency. Added missing mock servlet context method.**
 
 
[407a695342ba4b7](https://github.com/tomakehurst/wiremock/commit/407a695342ba4b7) Tom Akehurst *2012-01-17 16:45:47*
 
**Updated version in README and repo location**
 
 
[fe58d9ebe5ab5fb](https://github.com/tomakehurst/wiremock/commit/fe58d9ebe5ab5fb) Tom Akehurst *2012-01-16 23:14:30*
 
**Updated version and README**
 
 
[f0cd89c4bef7e77](https://github.com/tomakehurst/wiremock/commit/f0cd89c4bef7e77) Tom Akehurst *2012-01-16 23:12:19*
 
**Added WAR deployment acceptance test. Added ability to specify a path prefix for use with non-root deployments**
 
 
[beae172a2d8087a](https://github.com/tomakehurst/wiremock/commit/beae172a2d8087a) Tom Akehurst *2012-01-16 23:02:05*
 
**Added some command line tests**
 
 
[0d99a2cf33b3c0d](https://github.com/tomakehurst/wiremock/commit/0d99a2cf33b3c0d) Tom Akehurst *2012-01-16 22:36:06*
 
**Removed mock servlet context method incompatible with servlet api version**
 
 
[758a4cd907e469f](https://github.com/tomakehurst/wiremock/commit/758a4cd907e469f) Tom Akehurst *2012-01-16 21:50:50*
 
**Tidy up**
 
 
[278d131169269c5](https://github.com/tomakehurst/wiremock/commit/278d131169269c5) Tom Akehurst *2012-01-13 19:37:16*
 
**Fixed concurrency issue where a responses attached request was being shared across threads.**
 
 
[863e72afec0940e](https://github.com/tomakehurst/wiremock/commit/863e72afec0940e) Tom Akehurst *2012-01-13 19:33:07*
 
**Minor refactor of mapping recording listener**
 
 
[ebe066fcb6a2a5f](https://github.com/tomakehurst/wiremock/commit/ebe066fcb6a2a5f) Tom Akehurst *2012-01-11 15:56:51*
 
**Mappings are now not recorded if request matches one that has already been logged since startup**
 
 
[59c459bb244cd53](https://github.com/tomakehurst/wiremock/commit/59c459bb244cd53) Tom Akehurst *2012-01-11 15:39:33*
 
**Updated version in README standalone examples**
 
 
[8eea92f7df959e8](https://github.com/tomakehurst/wiremock/commit/8eea92f7df959e8) Tom Akehurst *2012-01-06 16:08:50*
 
**Updated version in sample WAR**
 
 
[5f2b3212f4094b0](https://github.com/tomakehurst/wiremock/commit/5f2b3212f4094b0) Tom Akehurst *2012-01-06 16:07:22*
 
**Updated version in README Maven example**
 
 
[30a081438931c51](https://github.com/tomakehurst/wiremock/commit/30a081438931c51) Tom Akehurst *2012-01-06 16:06:39*
 
**Moved packages and maven group from com.tomakehurst... to com.github.tomakehurst...**
 
 
[e2910f3d37e543b](https://github.com/tomakehurst/wiremock/commit/e2910f3d37e543b) Tom Akehurst *2012-01-06 16:02:06*
 
**Added a release-to task to the build to allow specification of an alternative release repo directory**
 
 
[409cea7ff18f4ee](https://github.com/tomakehurst/wiremock/commit/409cea7ff18f4ee) Tom Akehurst *2012-01-06 14:09:42*
 
**Now runnable inside a WAR**
 
 
[faa7f0c4c630719](https://github.com/tomakehurst/wiremock/commit/faa7f0c4c630719) Tom Akehurst *2012-01-06 10:28:08*
 
**More progress towards making WAR deployable**
 
 
[7b1bfa6a91bd2ad](https://github.com/tomakehurst/wiremock/commit/7b1bfa6a91bd2ad) Tom Akehurst *2012-01-05 15:58:14*
 
**Begun refactoring towards making WAR deployable.**
 
 
[37a09467baeafa9](https://github.com/tomakehurst/wiremock/commit/37a09467baeafa9) Tom Akehurst *2012-01-05 13:52:32*
 
**Removed non-alpha chars from filename suffixes on recording**
 
 
[3486c7e4f3e1d9a](https://github.com/tomakehurst/wiremock/commit/3486c7e4f3e1d9a) Tom Akehurst *2011-12-20 12:50:47*
 
**Minor fix to doc for withBodyContaining**
 
 
[cec34c127110f46](https://github.com/tomakehurst/wiremock/commit/cec34c127110f46) Tom Akehurst *2011-12-13 20:56:32*
 
**Updated docs to add withBodyContaining**
 
 
[3b9fa6e50c9ee21](https://github.com/tomakehurst/wiremock/commit/3b9fa6e50c9ee21) Tom Akehurst *2011-12-13 20:55:38*
 
**Added withBodyContaining to request pattern builder**
 
 
[f9c21fe5ead3f04](https://github.com/tomakehurst/wiremock/commit/f9c21fe5ead3f04) Tom Akehurst *2011-12-13 20:40:20*
 
**Fixed SingleRootFileSource bug. Added logging to proxy renderer.**
 
 
[c49c4639f36dcdf](https://github.com/tomakehurst/wiremock/commit/c49c4639f36dcdf) Tom Akehurst *2011-12-13 20:29:34*
 
**Fixed character set bug in reading body files**
 
 
[96db71fb702dd4e](https://github.com/tomakehurst/wiremock/commit/96db71fb702dd4e) Tom Akehurst *2011-12-13 17:49:38*
 
**Fixed gradle build source version**
 
 
[21e2f43c7b06cf5](https://github.com/tomakehurst/wiremock/commit/21e2f43c7b06cf5) Tom Akehurst *2011-12-12 21:43:58*
 
**Updated version to 1.7**
 
 
[6818a6f0fd083fa](https://github.com/tomakehurst/wiremock/commit/6818a6f0fd083fa) Tom Akehurst *2011-12-12 21:41:05*
 
**Reworked all code that uses httpclient to make proper use of thread safe implementation**
 
 
[c23faeab836bdbc](https://github.com/tomakehurst/wiremock/commit/c23faeab836bdbc) Tom Akehurst *2011-12-12 21:39:53*
 
**Upped version to 1.6 in README**
 
 
[93535a6a96ab216](https://github.com/tomakehurst/wiremock/commit/93535a6a96ab216) Tom Akehurst *2011-12-12 19:14:01*
 
**Bumped version to 1.6**
 
 
[8c2a0ef8169fdfd](https://github.com/tomakehurst/wiremock/commit/8c2a0ef8169fdfd) Tom Akehurst *2011-12-12 19:11:49*
 
**Fixed usage of apache http client in proxy renderer to a threadsafe configuration**
 
 
[5114186d393095d](https://github.com/tomakehurst/wiremock/commit/5114186d393095d) Tom Akehurst *2011-12-12 17:27:51*
 
**Revert "Added a global exception handler that pushes to the logger"**
 
 * This reverts commit 2b5c739dd52c55b665a12abbdd05093a96d0b979. 
 
[1ed257114f672e0](https://github.com/tomakehurst/wiremock/commit/1ed257114f672e0) Tom Akehurst *2011-12-12 16:01:59*
 
**Revert "Added missing exception handler files"**
 
 * This reverts commit a1c830a4310cf7342eb93582fe8456694e336772. 
 
[47308e751fbadf6](https://github.com/tomakehurst/wiremock/commit/47308e751fbadf6) Tom Akehurst *2011-12-12 16:01:47*
 
**Added missing exception handler files**
 
 
[a1c830a4310cf73](https://github.com/tomakehurst/wiremock/commit/a1c830a4310cf73) Tom Akehurst *2011-12-12 15:38:37*
 
**Added a global exception handler that pushes to the logger**
 
 
[2b5c739dd52c55b](https://github.com/tomakehurst/wiremock/commit/2b5c739dd52c55b) Tom Akehurst *2011-12-12 15:38:13*
 
**Mapping files are now loaded recursively**
 
 
[cef2ee59312e845](https://github.com/tomakehurst/wiremock/commit/cef2ee59312e845) Tom Akehurst *2011-12-11 21:38:38*
 
**Updated docs and tests for fault injection feature**
 
 
[6562e86b6d31752](https://github.com/tomakehurst/wiremock/commit/6562e86b6d31752) Tom Akehurst *2011-12-11 13:17:03*
 
**Refactored fault generating code and added two new fault types**
 
 
[83e60cb679bdd4f](https://github.com/tomakehurst/wiremock/commit/83e60cb679bdd4f) Tom Akehurst *2011-12-11 12:57:37*
 
**Added socket failure feature**
 
 
[533216b1a994726](https://github.com/tomakehurst/wiremock/commit/533216b1a994726) Tom Akehurst *2011-12-10 22:24:36*
 
**Minor tidyup**
 
 
[de7dbb8c9721a20](https://github.com/tomakehurst/wiremock/commit/de7dbb8c9721a20) Tom Akehurst *2011-12-10 21:41:11*
 
**Removed unused (old) rendering code. Upped proxy http client timeout to 5 minutes**
 
 
[4e6823231ccfdd1](https://github.com/tomakehurst/wiremock/commit/4e6823231ccfdd1) Tom Akehurst *2011-12-10 21:19:10*
 
**Made priority a number and changed mapping collection accordingly**
 
 
[746e42235c0b5dc](https://github.com/tomakehurst/wiremock/commit/746e42235c0b5dc) Tom Akehurst *2011-12-10 21:07:15*
 
**Removed @ from id generation for SVN compatibility**
 
 
[577dd345d97d8e6](https://github.com/tomakehurst/wiremock/commit/577dd345d97d8e6) Tom Akehurst *2011-12-07 13:09:44*
 
**Changed filename generation strategy for recorded mappings to fix concurrency bug**
 
 
[99c10287a9ef1b5](https://github.com/tomakehurst/wiremock/commit/99c10287a9ef1b5) Tom Akehurst *2011-12-07 12:26:54*
 
**Added response headers to recorded mappings**
 
 
[ca40630f90ceb24](https://github.com/tomakehurst/wiremock/commit/ca40630f90ceb24) Tom Akehurst *2011-12-07 10:39:14*
 
**Added fixed delay and response type fields to UI (not yet functioning)**
 
 
[7a4e33f01790f94](https://github.com/tomakehurst/wiremock/commit/7a4e33f01790f94) Tom Akehurst *2011-12-04 22:15:48*
 
**Added headers to admin UI (not yet functioning)**
 
 
[db559403330f585](https://github.com/tomakehurst/wiremock/commit/db559403330f585) Tom Akehurst *2011-12-04 21:59:06*
 
**Tweaks to UI page**
 
 
[f8469ae54c660bb](https://github.com/tomakehurst/wiremock/commit/f8469ae54c660bb) Tom Akehurst *2011-12-04 20:35:37*
 
**Split out js and css from admin page**
 
 
[af1c4e7f2f65758](https://github.com/tomakehurst/wiremock/commit/af1c4e7f2f65758) Tom Akehurst *2011-12-04 18:19:34*
 
**Added admin UI prototype (non-functioning)**
 
 
[56647a0f4623068](https://github.com/tomakehurst/wiremock/commit/56647a0f4623068) Tom Akehurst *2011-12-04 18:15:16*
 
**Added apache 2.0 licence**
 
 
[dc8182a509043e6](https://github.com/tomakehurst/wiremock/commit/dc8182a509043e6) Tom Akehurst *2011-12-04 12:27:02*
 
**Bumped version to 1.3**
 
 
[7de2ed2679c83ec](https://github.com/tomakehurst/wiremock/commit/7de2ed2679c83ec) Tom Akehurst *2011-12-01 08:24:31*
 
**Added ability to configure proxying from the commandline**
 
 
[e7524a82ebf3cdf](https://github.com/tomakehurst/wiremock/commit/e7524a82ebf3cdf) Tom Akehurst *2011-12-01 08:22:30*
 
**Updated version to 1.2**
 
 
[a6726534824739e](https://github.com/tomakehurst/wiremock/commit/a6726534824739e) Tom Akehurst *2011-11-30 23:23:36*
 
**Updated documentation**
 
 
[15ce42b95b9cda2](https://github.com/tomakehurst/wiremock/commit/15ce42b95b9cda2) Tom Akehurst *2011-11-30 23:21:44*
 
**Updated documentation**
 
 
[f72df6d6b78c291](https://github.com/tomakehurst/wiremock/commit/f72df6d6b78c291) Tom Akehurst *2011-11-30 23:20:02*
 
**Added logging of URL non-matches**
 
 
[ef9052eab13db9f](https://github.com/tomakehurst/wiremock/commit/ef9052eab13db9f) Tom Akehurst *2011-11-30 22:22:53*
 
**Added proper commandline option parsing**
 
 
[a125bd5c68f3b64](https://github.com/tomakehurst/wiremock/commit/a125bd5c68f3b64) Tom Akehurst *2011-11-30 22:13:15*
 
**Added more logging to RequestPattern matching methods**
 
 
[a4e07def17bdf16](https://github.com/tomakehurst/wiremock/commit/a4e07def17bdf16) Tom Akehurst *2011-11-29 22:57:27*
 
**Minor tweak to mapping writer listener**
 
 
[b73085cf24f124d](https://github.com/tomakehurst/wiremock/commit/b73085cf24f124d) Tom Akehurst *2011-11-29 07:41:51*
 
**Tweaked proxy test to ensure query params work**
 
 
[0a0e173bc86a3e3](https://github.com/tomakehurst/wiremock/commit/0a0e173bc86a3e3) Tom Akehurst *2011-11-28 22:52:37*
 
**Added ability to record mappings**
 
 
[9f3b2a753927969](https://github.com/tomakehurst/wiremock/commit/9f3b2a753927969) Tom Akehurst *2011-11-28 22:49:09*
 
**Separated Response and ResponseDefinition concepts. Renderers now render Response objects, rather than going directly to HttpServletResponse. This facilitates listeners making use of Responses more easily**
 
 
[8fd23799c8a241e](https://github.com/tomakehurst/wiremock/commit/8fd23799c8a241e) Tom Akehurst *2011-11-28 22:13:56*
 
**Added (not currently wired in) mapping file recording listener**
 
 
[39e909a5008157b](https://github.com/tomakehurst/wiremock/commit/39e909a5008157b) Tom Akehurst *2011-11-28 18:48:23*
 
**Refactored mapping loaded to expose mapping directory as a FileSource**
 
 
[b974f34b867ec78](https://github.com/tomakehurst/wiremock/commit/b974f34b867ec78) Tom Akehurst *2011-11-28 12:37:44*
 
**Factored out proxy response rendering into own class**
 
 
[f235dc8d02b317b](https://github.com/tomakehurst/wiremock/commit/f235dc8d02b317b) Tom Akehurst *2011-11-28 12:11:41*
 
**Switched high to low priority for use with proxy feature**
 
 
[707d4c8895054f2](https://github.com/tomakehurst/wiremock/commit/707d4c8895054f2) Tom Akehurst *2011-11-28 11:07:07*
 
**Added proxy capability**
 
 
[6b518e14b5e2b19](https://github.com/tomakehurst/wiremock/commit/6b518e14b5e2b19) Tom Akehurst *2011-11-28 11:02:30*
 
**Refactored InMemoryRequestJournal to a functional pattern**
 
 
[0383c81870a0c8d](https://github.com/tomakehurst/wiremock/commit/0383c81870a0c8d) Tom Akehurst *2011-11-26 10:30:00*
 
**Added ability to prioritise mappings as normal or high**
 
 
[09d3cb4ca49dff0](https://github.com/tomakehurst/wiremock/commit/09d3cb4ca49dff0) Tom Akehurst *2011-11-26 10:07:15*
 
**Added missing any method to fluent API**
 
 
[0868b4650448e2a](https://github.com/tomakehurst/wiremock/commit/0868b4650448e2a) Tom Akehurst *2011-11-26 09:38:52*
 
**Minor cleanup**
 
 
[7a29958e6893dd1](https://github.com/tomakehurst/wiremock/commit/7a29958e6893dd1) Tom Akehurst *2011-11-25 22:45:06*
 
**Added support for matching on any request method**
 
 
[20df9b7c8a9ce06](https://github.com/tomakehurst/wiremock/commit/20df9b7c8a9ce06) Tom Akehurst *2011-11-25 22:30:07*
 
**Fixed empty verification method**
 
 
[c622f820bc1d946](https://github.com/tomakehurst/wiremock/commit/c622f820bc1d946) Tom Akehurst *2011-11-25 22:19:20*
 
**Added global fixed delay setting**
 
 
[0d2cadd7e8c42a4](https://github.com/tomakehurst/wiremock/commit/0d2cadd7e8c42a4) Tom Akehurst *2011-11-25 22:16:15*
 
**Added ability to set fixed delay on responses**
 
 
[a746e68560865cb](https://github.com/tomakehurst/wiremock/commit/a746e68560865cb) Tom Akehurst *2011-11-25 17:01:46*
 
**Revert "Switched mapping predicate to use named inner class rather than anon to avoid risk of permgen depletion"**
 
 * This reverts commit bf976a7b6de6abe8cc35130029f270c6252ce14b. 
 
[8c0a219e23bc6cb](https://github.com/tomakehurst/wiremock/commit/8c0a219e23bc6cb) Tom Akehurst *2011-11-24 21:08:10*
 
**Switched mapping predicate to use named inner class rather than anon to avoid risk of permgen depletion**
 
 
[bf976a7b6de6abe](https://github.com/tomakehurst/wiremock/commit/bf976a7b6de6abe) Tom Akehurst *2011-11-22 21:46:43*
 
**Refactored mapping finder to use guava find function**
 
 
[af1a10859275059](https://github.com/tomakehurst/wiremock/commit/af1a10859275059) Tom Akehurst *2011-11-22 20:22:41*
 
**Added additional test for body file reading**
 
 
[3f9355bb5eee10e](https://github.com/tomakehurst/wiremock/commit/3f9355bb5eee10e) Tom Akehurst *2011-11-20 17:37:37*
 
**Removed site context. __files can be used for the same purpose.**
 
 
[54ca5b1a88c689f](https://github.com/tomakehurst/wiremock/commit/54ca5b1a88c689f) Tom Akehurst *2011-11-20 17:30:28*
 
**Added acceptance tests for standalone runner. Factored out runner to separate class from server.**
 
 
[f25b871ca95137f](https://github.com/tomakehurst/wiremock/commit/f25b871ca95137f) Tom Akehurst *2011-11-20 17:28:59*
 
**Added fixes for static file redirection by default servlet**
 
 
[a12a81f846fd0a5](https://github.com/tomakehurst/wiremock/commit/a12a81f846fd0a5) Tom Akehurst *2011-11-18 17:09:26*
 
**Files under __files will now be served even if no response is explicitly defined**
 
 
[b9fc2b54ba3d4ce](https://github.com/tomakehurst/wiremock/commit/b9fc2b54ba3d4ce) Tom Akehurst *2011-11-18 15:17:56*
 
**Added static site serving capability**
 
 
[d5a9b6896e59d2c](https://github.com/tomakehurst/wiremock/commit/d5a9b6896e59d2c) Tom Akehurst *2011-11-15 16:02:06*
 
**Added ability to read body files from 'files' dir when in standalone mode**
 
 
[8d966f985a00269](https://github.com/tomakehurst/wiremock/commit/8d966f985a00269) Tom Akehurst *2011-11-13 20:06:21*
 
**Added file based response body support**
 
 
[2e96c25850c49ad](https://github.com/tomakehurst/wiremock/commit/2e96c25850c49ad) Tom Akehurst *2011-11-13 19:54:13*
 
**Updated README**
 
 
[42af03e681f2de7](https://github.com/tomakehurst/wiremock/commit/42af03e681f2de7) Tom Akehurst *2011-11-01 21:51:29*
 
**Updated README**
 
 
[13fb90f1833ca52](https://github.com/tomakehurst/wiremock/commit/13fb90f1833ca52) Tom Akehurst *2011-11-01 21:48:09*
 
**Added release task to build, which deploys both JAR and standalone JAR**
 
 
[3f7f6c499cc4ae5](https://github.com/tomakehurst/wiremock/commit/3f7f6c499cc4ae5) Tom Akehurst *2011-10-30 21:07:28*
 
**Updated README. Build can now generate Maven release.**
 
 
[010e51b0238a006](https://github.com/tomakehurst/wiremock/commit/010e51b0238a006) Tom Akehurst *2011-10-30 18:11:18*
 
**Updated README**
 
 
[a20a495b91978db](https://github.com/tomakehurst/wiremock/commit/a20a495b91978db) Tom Akehurst *2011-10-30 15:22:29*
 
**Updated README**
 
 
[d19cb4c3c3ae104](https://github.com/tomakehurst/wiremock/commit/d19cb4c3c3ae104) Tom Akehurst *2011-10-30 15:19:19*
 
**Updated README and JSON sample**
 
 
[02225559633ca0d](https://github.com/tomakehurst/wiremock/commit/02225559633ca0d) Tom Akehurst *2011-10-30 15:15:12*
 
**Updated README**
 
 
[c7ad42814538559](https://github.com/tomakehurst/wiremock/commit/c7ad42814538559) Tom Akehurst *2011-10-30 14:43:16*
 
**Updated draft README.md**
 
 
[d4463137623264d](https://github.com/tomakehurst/wiremock/commit/d4463137623264d) Tom Akehurst *2011-10-30 11:04:38*
 
**Updated draft README.md**
 
 
[13c5bf6e692caa9](https://github.com/tomakehurst/wiremock/commit/13c5bf6e692caa9) Tom Akehurst *2011-10-30 11:02:40*
 
**Added draft README.md**
 
 
[b99aab9285c4a7e](https://github.com/tomakehurst/wiremock/commit/b99aab9285c4a7e) Tom Akehurst *2011-10-30 11:01:11*
 
**Minor cleanup and fixed test order dependency problem**
 
 
[10eaedec3aba42d](https://github.com/tomakehurst/wiremock/commit/10eaedec3aba42d) Tom Akehurst *2011-10-29 20:56:38*
 
**Refactored acceptance tests to use single superclass**
 
 
[ed4f403de3c327a](https://github.com/tomakehurst/wiremock/commit/ed4f403de3c327a) Tom Akehurst *2011-10-29 20:34:12*
 
**Now uses a single servlet for admin and mock services**
 
 
[ce43829e71bd624](https://github.com/tomakehurst/wiremock/commit/ce43829e71bd624) Tom Akehurst *2011-10-29 20:23:56*
 
**Fixed URLs with query strings matching issue**
 
 
[a44f396c5d083c6](https://github.com/tomakehurst/wiremock/commit/a44f396c5d083c6) Tom Akehurst *2011-10-29 16:18:31*
 
**Added count verifications**
 
 
[4444e46941d561f](https://github.com/tomakehurst/wiremock/commit/4444e46941d561f) Tom Akehurst *2011-10-29 16:04:37*
 
**Added body matching for verifications**
 
 
[f0c9b9cb5dc9a0c](https://github.com/tomakehurst/wiremock/commit/f0c9b9cb5dc9a0c) Tom Akehurst *2011-10-29 15:58:26*
 
**Fixed bug in test client caused by changing reset URL**
 
 
[9e2348cda77d8c5](https://github.com/tomakehurst/wiremock/commit/9e2348cda77d8c5) Tom Akehurst *2011-10-29 15:14:18*
 
**Reset now also resets verification counters**
 
 
[8a161d5f09b2c67](https://github.com/tomakehurst/wiremock/commit/8a161d5f09b2c67) Tom Akehurst *2011-10-29 15:00:55*
 
**Added additional acceptance test and failing test for verification counter reset**
 
 
[b971dfeac31fda1](https://github.com/tomakehurst/wiremock/commit/b971dfeac31fda1) Tom Akehurst *2011-10-29 14:24:02*
 
**Added initial verification feature**
 
 
[ee3fef8134e0d16](https://github.com/tomakehurst/wiremock/commit/ee3fef8134e0d16) Tom Akehurst *2011-10-29 14:00:17*
 
**Now uses a list rather than a set for storing mappings in memory, and inserts at the head of the list, allowing mappings to be effectively overwritten**
 
 
[a0905cf8600e39f](https://github.com/tomakehurst/wiremock/commit/a0905cf8600e39f) Tom Akehurst *2011-10-23 20:29:16*
 
**Test improvements**
 
 
[b9a52c793d7d828](https://github.com/tomakehurst/wiremock/commit/b9a52c793d7d828) Tom Akehurst *2011-10-23 19:38:03*
 
**Switched to copy-on-write set for mappings storage. Removed pre-canned mapping.**
 
 
[04f025cfa157bc5](https://github.com/tomakehurst/wiremock/commit/04f025cfa157bc5) Tom Akehurst *2011-10-23 19:09:28*
 
**Added request header matching to fluent API**
 
 
[c1a9fb002f4db14](https://github.com/tomakehurst/wiremock/commit/c1a9fb002f4db14) Tom Akehurst *2011-10-23 16:34:51*
 
**Added more fluent API features**
 
 
[537b9640038a5ee](https://github.com/tomakehurst/wiremock/commit/537b9640038a5ee) Tom Akehurst *2011-10-23 15:56:34*
 
**Factored out http client. Initial unit test for fluent API.**
 
 
[559a3d182f9756b](https://github.com/tomakehurst/wiremock/commit/559a3d182f9756b) Tom Akehurst *2011-10-23 15:25:58*
 
**Minor tidyup**
 
 
[5b0d1e146c08586](https://github.com/tomakehurst/wiremock/commit/5b0d1e146c08586) Tom Akehurst *2011-10-23 14:30:45*
 
**Added ability to set host and port when using WireMock statically**
 
 
[9b80f5a7d0eee4c](https://github.com/tomakehurst/wiremock/commit/9b80f5a7d0eee4c) Tom Akehurst *2011-10-22 15:59:41*
 
**Now supports setting of host and port for static use of WireMock**
 
 
[18b02d2f52151d7](https://github.com/tomakehurst/wiremock/commit/18b02d2f52151d7) Tom Akehurst *2011-10-22 15:30:53*
 
**Added basics of fluent Java API**
 
 
[f3dd65d27f451c6](https://github.com/tomakehurst/wiremock/commit/f3dd65d27f451c6) Tom Akehurst *2011-10-22 14:22:17*
 
**Minor refactor**
 
 
[82aa013afc03ae3](https://github.com/tomakehurst/wiremock/commit/82aa013afc03ae3) Tom Akehurst *2011-10-22 12:47:23*
 
**Minor renamings**
 
 
[d35502c6cb55466](https://github.com/tomakehurst/wiremock/commit/d35502c6cb55466) Tom Akehurst *2011-10-22 12:39:14*
 
**Added cobertura plugin**
 
 
[130878664b685c4](https://github.com/tomakehurst/wiremock/commit/130878664b685c4) Tom Akehurst *2011-10-22 12:23:31*
 
**Added positive and negative regex matching on headers**
 
 
[0c9eb2b22e3d536](https://github.com/tomakehurst/wiremock/commit/0c9eb2b22e3d536) Tom Akehurst *2011-10-22 12:14:52*
 
**Added URL regex matching. Changed to consistently use URL instead of URI in naming. Removed ImmutableRequest, replaced with mocks**
 
 
[43df703f78f9359](https://github.com/tomakehurst/wiremock/commit/43df703f78f9359) Tom Akehurst *2011-10-22 10:45:41*
 
**Added ability to set port number from command line**
 
 
[11cb36824b73abe](https://github.com/tomakehurst/wiremock/commit/11cb36824b73abe) Tom Akehurst *2011-10-19 07:55:09*
 
**Switched standalone server to only use one Jetty instance and create an admin context within it. Factored mapping loading behaviour**
 
 
[7cf00bbd835a182](https://github.com/tomakehurst/wiremock/commit/7cf00bbd835a182) Tom Akehurst *2011-10-19 07:37:34*
 
**Can now load canned mappings from 'requests' directory**
 
 
[33d136ea2ed914a](https://github.com/tomakehurst/wiremock/commit/33d136ea2ed914a) Tom Akehurst *2011-10-16 22:21:47*
 
**Added support for resetting mappings**
 
 
[9fc4649d2720c09](https://github.com/tomakehurst/wiremock/commit/9fc4649d2720c09) Tom Akehurst *2011-10-16 18:38:28*
 
**Added acceptance test cases for multiple mappings**
 
 
[4a49eee3a12cd66](https://github.com/tomakehurst/wiremock/commit/4a49eee3a12cd66) Tom Akehurst *2011-10-16 18:11:23*
 
**Now support exact matching of request headers**
 
 
[906ada69f408bd5](https://github.com/tomakehurst/wiremock/commit/906ada69f408bd5) Tom Akehurst *2011-10-16 17:49:36*
 
**Added ability to add headers to responses**
 
 
[b3a54f1c7e9d217](https://github.com/tomakehurst/wiremock/commit/b3a54f1c7e9d217) Tom Akehurst *2011-10-15 14:14:13*
 
**Added main method and oneJar build task to allow to be run standalone**
 
 
[ca38da26197a733](https://github.com/tomakehurst/wiremock/commit/ca38da26197a733) Tom Akehurst *2011-10-15 12:29:43*
 
**Basic responses can now be configured via JSON posted to the server**
 
 
[f63901f18e87682](https://github.com/tomakehurst/wiremock/commit/f63901f18e87682) Tom Akehurst *2011-10-14 22:19:28*
 
**Further refactorings of servlets to extract request handlers. Some naming improvements**
 
 
[1fe4ca3b43924f7](https://github.com/tomakehurst/wiremock/commit/1fe4ca3b43924f7) Tom Akehurst *2011-10-10 21:37:46*
 
**Factored out request to response mapping to new class structure**
 
 
[5fa29da199057c7](https://github.com/tomakehurst/wiremock/commit/5fa29da199057c7) Tom Akehurst *2011-10-09 20:24:21*
 
 

