package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface zzcr extends IInterface {
    void beginAdUnitExposure(String str, long j7);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j7);

    void endAdUnitExposure(String str, long j7);

    void generateEventId(zzcu zzcuVar);

    void getAppInstanceId(zzcu zzcuVar);

    void getCachedAppInstanceId(zzcu zzcuVar);

    void getConditionalUserProperties(String str, String str2, zzcu zzcuVar);

    void getCurrentScreenClass(zzcu zzcuVar);

    void getCurrentScreenName(zzcu zzcuVar);

    void getGmpAppId(zzcu zzcuVar);

    void getMaxUserProperties(String str, zzcu zzcuVar);

    void getSessionId(zzcu zzcuVar);

    void getTestFlag(zzcu zzcuVar, int i7);

    void getUserProperties(String str, String str2, boolean z7, zzcu zzcuVar);

    void initForTests(Map map);

    void initialize(InterfaceC3772a interfaceC3772a, zzdd zzddVar, long j7);

    void isDataCollectionEnabled(zzcu zzcuVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j7);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcu zzcuVar, long j7);

    void logHealthData(int i7, String str, InterfaceC3772a interfaceC3772a, InterfaceC3772a interfaceC3772a2, InterfaceC3772a interfaceC3772a3);

    void onActivityCreated(InterfaceC3772a interfaceC3772a, Bundle bundle, long j7);

    void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j7);

    void onActivityDestroyed(InterfaceC3772a interfaceC3772a, long j7);

    void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j7);

    void onActivityPaused(InterfaceC3772a interfaceC3772a, long j7);

    void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j7);

    void onActivityResumed(InterfaceC3772a interfaceC3772a, long j7);

    void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j7);

    void onActivitySaveInstanceState(InterfaceC3772a interfaceC3772a, zzcu zzcuVar, long j7);

    void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, zzcu zzcuVar, long j7);

    void onActivityStarted(InterfaceC3772a interfaceC3772a, long j7);

    void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j7);

    void onActivityStopped(InterfaceC3772a interfaceC3772a, long j7);

    void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j7);

    void performAction(Bundle bundle, zzcu zzcuVar, long j7);

    void registerOnMeasurementEventListener(zzda zzdaVar);

    void resetAnalyticsData(long j7);

    void retrieveAndUploadBatches(zzcx zzcxVar);

    void setConditionalUserProperty(Bundle bundle, long j7);

    void setConsent(Bundle bundle, long j7);

    void setConsentThirdParty(Bundle bundle, long j7);

    void setCurrentScreen(InterfaceC3772a interfaceC3772a, String str, String str2, long j7);

    void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j7);

    void setDataCollectionEnabled(boolean z7);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(zzda zzdaVar);

    void setInstanceIdProvider(zzdc zzdcVar);

    void setMeasurementEnabled(boolean z7, long j7);

    void setMinimumSessionDuration(long j7);

    void setSessionTimeoutDuration(long j7);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j7);

    void setUserProperty(String str, String str2, InterfaceC3772a interfaceC3772a, boolean z7, long j7);

    void unregisterOnMeasurementEventListener(zzda zzdaVar);
}
