package com.google.android.play.integrity.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.r */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4788r {
    /* JADX INFO: renamed from: a */
    public static final List m21933a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC4790t abstractC4790t = (AbstractC4790t) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", abstractC4790t.mo21935a());
            bundle.putLong("event_timestamp", abstractC4790t.mo21936b());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final void m21934b(int i7, List list) {
        list.add(AbstractC4790t.m21937c(i7, System.currentTimeMillis()));
    }
}
