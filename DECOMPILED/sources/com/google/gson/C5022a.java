package com.google.gson;

import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.gson.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5022a {

    /* JADX INFO: renamed from: a */
    private final Field f19035a;

    public C5022a(Field field) {
        Objects.requireNonNull(field);
        this.f19035a = field;
    }

    public String toString() {
        return this.f19035a.toString();
    }
}
