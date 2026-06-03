#pragma once
#include "common.h"
#include <stdlib.h>

typedef enum {
    OP_RETURN,
} Opcode;

typedef struct {
    int count;
    int capacity;
    uint8_t* code;
} Chunk;

void initChunk(Chunk* chunk);
void writeChunk(Chunk* chunk, uint8_t* code);
