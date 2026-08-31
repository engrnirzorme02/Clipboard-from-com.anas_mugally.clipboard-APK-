package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import p177X2.InterfaceC1948d;

/* JADX INFO: renamed from: com.google.android.gms.common.server.response.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3735b extends AbstractC3734a implements InterfaceC1948d {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        AbstractC3734a abstractC3734a = (AbstractC3734a) obj;
        for (AbstractC3734a.a aVar : getFieldMappings().values()) {
            if (isFieldSet(aVar)) {
                if (!abstractC3734a.isFieldSet(aVar) || !AbstractC3714q.m18053b(getFieldValue(aVar), abstractC3734a.getFieldValue(aVar))) {
                    return false;
                }
            } else if (abstractC3734a.isFieldSet(aVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    public Object getValueObject(String str) {
        return null;
    }

    public int hashCode() {
        int iHashCode = 0;
        for (AbstractC3734a.a aVar : getFieldMappings().values()) {
            if (isFieldSet(aVar)) {
                iHashCode = (iHashCode * 31) + AbstractC3718s.m18083l(getFieldValue(aVar)).hashCode();
            }
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    public boolean isPrimitiveFieldSet(String str) {
        return false;
    }
}
