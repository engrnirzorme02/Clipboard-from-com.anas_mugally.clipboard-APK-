package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.measurement.internal.C4164X2;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p283k3.AbstractC6049t;
import p283k3.InterfaceC6022E;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class AppMeasurement {

    /* JADX INFO: renamed from: b */
    private static volatile AppMeasurement f15050b;

    /* JADX INFO: renamed from: a */
    private final AbstractC3990c f15051a;

    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;

        ConditionalUserProperty(Bundle bundle) {
            AbstractC3718s.m18083l(bundle);
            this.mAppId = (String) AbstractC6049t.m27058b(bundle, "app_id", String.class, null);
            this.mOrigin = (String) AbstractC6049t.m27058b(bundle, "origin", String.class, null);
            this.mName = (String) AbstractC6049t.m27058b(bundle, "name", String.class, null);
            this.mValue = AbstractC6049t.m27058b(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) AbstractC6049t.m27058b(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) AbstractC6049t.m27058b(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) AbstractC6049t.m27058b(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) AbstractC6049t.m27058b(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) AbstractC6049t.m27058b(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) AbstractC6049t.m27058b(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) AbstractC6049t.m27058b(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) AbstractC6049t.m27058b(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) AbstractC6049t.m27058b(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) AbstractC6049t.m27058b(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) AbstractC6049t.m27058b(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) AbstractC6049t.m27058b(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(C4164X2 c4164x2) {
        this.f15051a = new C3988a(c4164x2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f15050b == null) {
            synchronized (AppMeasurement.class) {
                if (f15050b == null) {
                    InterfaceC6022E interfaceC6022E = (InterfaceC6022E) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (interfaceC6022E != null) {
                        f15050b = new AppMeasurement(interfaceC6022E);
                    } else {
                        f15050b = new AppMeasurement(C4164X2.m18653O(context, new zzdd(0L, 0L, true, null, null), null));
                    }
                }
            }
        }
        return f15050b;
    }

    public void beginAdUnitExposure(String str) {
        this.f15051a.zzm(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f15051a.mo18413b(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.f15051a.zzn(str);
    }

    public long generateEventId() {
        return this.f15051a.zzl();
    }

    public String getAppInstanceId() {
        return this.f15051a.zzj();
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List listMo18414c = this.f15051a.mo18414c(str, str2);
        ArrayList arrayList = new ArrayList(listMo18414c == null ? 0 : listMo18414c.size());
        Iterator it = listMo18414c.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.f15051a.zzi();
    }

    public String getCurrentScreenName() {
        return this.f15051a.zzh();
    }

    public String getGmpAppId() {
        return this.f15051a.zzk();
    }

    public int getMaxUserProperties(String str) {
        return this.f15051a.zzr(str);
    }

    protected Map<String, Object> getUserProperties(String str, String str2, boolean z7) {
        return this.f15051a.mo18415d(str, str2, z7);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f15051a.mo18412a(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        AbstractC3718s.m18083l(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            AbstractC6049t.m27057a(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        AbstractC3990c abstractC3990c = this.f15051a;
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        abstractC3990c.zzo(bundle);
    }

    public AppMeasurement(InterfaceC6022E interfaceC6022E) {
        this.f15051a = new C3989b(interfaceC6022E);
    }
}
