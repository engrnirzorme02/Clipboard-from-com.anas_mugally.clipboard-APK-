package com.google.android.recaptcha.internal;

import java.util.concurrent.CancellationException;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p294l6.InterfaceC6304e;
import p318o6.InterfaceC6639V;
import p318o6.InterfaceC6661e0;
import p318o6.InterfaceC6692u;
import p318o6.InterfaceC6696w;
import p318o6.InterfaceC6698x;
import p318o6.InterfaceC6701y0;
import p384w6.InterfaceC7360a;
import p384w6.InterfaceC7362c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbw implements InterfaceC6639V {
    private final /* synthetic */ InterfaceC6698x zza;

    zzbw(InterfaceC6698x interfaceC6698x) {
        this.zza = interfaceC6698x;
    }

    @Override // p318o6.InterfaceC6701y0
    public final InterfaceC6692u attachChild(InterfaceC6696w interfaceC6696w) {
        return this.zza.attachChild(interfaceC6696w);
    }

    @Override // p318o6.InterfaceC6639V
    public final Object await(InterfaceC1875e interfaceC1875e) {
        return this.zza.await(interfaceC1875e);
    }

    @Override // p318o6.InterfaceC6701y0
    public final /* synthetic */ void cancel() {
        this.zza.cancel();
    }

    @Override // p173W5.InterfaceC1879i.b, p173W5.InterfaceC1879i
    public final Object fold(Object obj, InterfaceC5371p interfaceC5371p) {
        return this.zza.fold(obj, interfaceC5371p);
    }

    @Override // p173W5.InterfaceC1879i.b, p173W5.InterfaceC1879i
    public final InterfaceC1879i.b get(InterfaceC1879i.c cVar) {
        return this.zza.get(cVar);
    }

    @Override // p318o6.InterfaceC6701y0
    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    @Override // p318o6.InterfaceC6701y0
    public final InterfaceC6304e getChildren() {
        return this.zza.getChildren();
    }

    @Override // p318o6.InterfaceC6639V
    public final Object getCompleted() {
        return this.zza.getCompleted();
    }

    @Override // p318o6.InterfaceC6639V
    public final Throwable getCompletionExceptionOrNull() {
        return this.zza.getCompletionExceptionOrNull();
    }

    @Override // p173W5.InterfaceC1879i.b
    public final InterfaceC1879i.c getKey() {
        return this.zza.getKey();
    }

    @Override // p318o6.InterfaceC6639V
    public final InterfaceC7362c getOnAwait() {
        return this.zza.getOnAwait();
    }

    @Override // p318o6.InterfaceC6701y0
    public final InterfaceC7360a getOnJoin() {
        return this.zza.getOnJoin();
    }

    @Override // p318o6.InterfaceC6701y0
    public final InterfaceC6701y0 getParent() {
        return this.zza.getParent();
    }

    @Override // p318o6.InterfaceC6701y0
    public final InterfaceC6661e0 invokeOnCompletion(InterfaceC5367l interfaceC5367l) {
        return this.zza.invokeOnCompletion(interfaceC5367l);
    }

    @Override // p318o6.InterfaceC6701y0
    public final boolean isActive() {
        return this.zza.isActive();
    }

    @Override // p318o6.InterfaceC6701y0
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // p318o6.InterfaceC6701y0
    public final boolean isCompleted() {
        return this.zza.isCompleted();
    }

    @Override // p318o6.InterfaceC6701y0
    public final Object join(InterfaceC1875e interfaceC1875e) {
        return this.zza.join(interfaceC1875e);
    }

    @Override // p173W5.InterfaceC1879i.b, p173W5.InterfaceC1879i
    public final InterfaceC1879i minusKey(InterfaceC1879i.c cVar) {
        return this.zza.minusKey(cVar);
    }

    @Override // p173W5.InterfaceC1879i
    public final InterfaceC1879i plus(InterfaceC1879i interfaceC1879i) {
        return this.zza.plus(interfaceC1879i);
    }

    @Override // p318o6.InterfaceC6701y0
    public final boolean start() {
        return this.zza.start();
    }

    @Override // p318o6.InterfaceC6701y0
    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    @Override // p318o6.InterfaceC6701y0
    public final InterfaceC6661e0 invokeOnCompletion(boolean z7, boolean z8, InterfaceC5367l interfaceC5367l) {
        return this.zza.invokeOnCompletion(z7, z8, interfaceC5367l);
    }

    @Override // p318o6.InterfaceC6701y0
    public final InterfaceC6701y0 plus(InterfaceC6701y0 interfaceC6701y0) {
        return this.zza.plus(interfaceC6701y0);
    }

    @Override // p318o6.InterfaceC6701y0
    public final /* synthetic */ boolean cancel(Throwable th) {
        return this.zza.cancel(th);
    }
}
