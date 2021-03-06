/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * Modify at your own risk.
 */

package com.google.testing.model;

/**
 * A test of an Android Application with a Test Loop. The intent \ will be implicitly added, since
 * Games is the only user of this api, for the time being.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AndroidTestLoop extends com.google.api.client.json.GenericJson {

  /**
   * The APK for the application under test.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FileReference appApk;

  /**
   * A multi-apk app bundle for the application under test.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppBundle appBundle;

  /**
   * The java package for the application under test. The default is determined by examining the
   * application's manifest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appPackageId;

  /**
   * The list of scenario labels that should be run during the test. The scenario labels should map
   * to labels defined in the application's manifest. For example, player_experience and
   * com.google.test.loops.player_experience add all of the loops labeled in the manifest with the
   * com.google.test.loops.player_experience name to the execution. Scenarios can also be specified
   * in the scenarios field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> scenarioLabels;

  /**
   * The list of scenarios that should be run during the test. The default is all test loops,
   * derived from the application's manifest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> scenarios;

  /**
   * The APK for the application under test.
   * @return value or {@code null} for none
   */
  public FileReference getAppApk() {
    return appApk;
  }

  /**
   * The APK for the application under test.
   * @param appApk appApk or {@code null} for none
   */
  public AndroidTestLoop setAppApk(FileReference appApk) {
    this.appApk = appApk;
    return this;
  }

  /**
   * A multi-apk app bundle for the application under test.
   * @return value or {@code null} for none
   */
  public AppBundle getAppBundle() {
    return appBundle;
  }

  /**
   * A multi-apk app bundle for the application under test.
   * @param appBundle appBundle or {@code null} for none
   */
  public AndroidTestLoop setAppBundle(AppBundle appBundle) {
    this.appBundle = appBundle;
    return this;
  }

  /**
   * The java package for the application under test. The default is determined by examining the
   * application's manifest.
   * @return value or {@code null} for none
   */
  public java.lang.String getAppPackageId() {
    return appPackageId;
  }

  /**
   * The java package for the application under test. The default is determined by examining the
   * application's manifest.
   * @param appPackageId appPackageId or {@code null} for none
   */
  public AndroidTestLoop setAppPackageId(java.lang.String appPackageId) {
    this.appPackageId = appPackageId;
    return this;
  }

  /**
   * The list of scenario labels that should be run during the test. The scenario labels should map
   * to labels defined in the application's manifest. For example, player_experience and
   * com.google.test.loops.player_experience add all of the loops labeled in the manifest with the
   * com.google.test.loops.player_experience name to the execution. Scenarios can also be specified
   * in the scenarios field.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getScenarioLabels() {
    return scenarioLabels;
  }

  /**
   * The list of scenario labels that should be run during the test. The scenario labels should map
   * to labels defined in the application's manifest. For example, player_experience and
   * com.google.test.loops.player_experience add all of the loops labeled in the manifest with the
   * com.google.test.loops.player_experience name to the execution. Scenarios can also be specified
   * in the scenarios field.
   * @param scenarioLabels scenarioLabels or {@code null} for none
   */
  public AndroidTestLoop setScenarioLabels(java.util.List<java.lang.String> scenarioLabels) {
    this.scenarioLabels = scenarioLabels;
    return this;
  }

  /**
   * The list of scenarios that should be run during the test. The default is all test loops,
   * derived from the application's manifest.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getScenarios() {
    return scenarios;
  }

  /**
   * The list of scenarios that should be run during the test. The default is all test loops,
   * derived from the application's manifest.
   * @param scenarios scenarios or {@code null} for none
   */
  public AndroidTestLoop setScenarios(java.util.List<java.lang.Integer> scenarios) {
    this.scenarios = scenarios;
    return this;
  }

  @Override
  public AndroidTestLoop set(String fieldName, Object value) {
    return (AndroidTestLoop) super.set(fieldName, value);
  }

  @Override
  public AndroidTestLoop clone() {
    return (AndroidTestLoop) super.clone();
  }

}
