package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.transition.v */
/* JADX INFO: loaded from: classes.dex */
public class C2854v {

    /* JADX INFO: renamed from: b */
    public View f11569b;

    /* JADX INFO: renamed from: a */
    public final Map f11568a = new HashMap();

    /* JADX INFO: renamed from: c */
    final ArrayList f11570c = new ArrayList();

    public C2854v(View view) {
        this.f11569b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2854v)) {
            return false;
        }
        C2854v c2854v = (C2854v) obj;
        return this.f11569b == c2854v.f11569b && this.f11568a.equals(c2854v.f11568a);
    }

    public int hashCode() {
        return (this.f11569b.hashCode() * 31) + this.f11568a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f11569b + "\n") + "    values:";
        for (String str2 : this.f11568a.keySet()) {
            str = str + "    " + str2 + ": " + this.f11568a.get(str2) + "\n";
        }
        return str;
    }
}
